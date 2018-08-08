package my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();
    private Reflections scanner = new Reflections("my_spring");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> clazz : classes) {
            if (!Modifier.isAbstract(clazz.getModifiers())) {
                configurators.add(clazz.newInstance());
            }
        }
        Set<Class<? extends ProxyConfigurator>> set = scanner.getSubTypesOf(ProxyConfigurator.class);
        for (Class<? extends ProxyConfigurator> aClass : set) {
            proxyConfigurators.add(aClass.newInstance());
        }
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);
        T t = type.newInstance();
        configure(t);
        t = wrapWithProxyIfNeeded(type, t);
        return t;
    }







    private <T> T wrapWithProxyIfNeeded(Class<T> type, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.wrapWithProxyIfNeeded(t, type);
        }
        return t;
    }


    private <T> void configure(T t) {
        configurators.forEach(objectConfigurator -> objectConfigurator.configure(t));
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        return type;
    }


}
