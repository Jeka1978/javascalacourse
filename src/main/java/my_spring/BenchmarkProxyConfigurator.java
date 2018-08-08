package my_spring;

import com.sun.media.jfxmediaimpl.platform.PlatformManager;
import lombok.SneakyThrows;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {

    private BenchmarkToggle toggle = new BenchmarkToggle();

    @SneakyThrows
    public BenchmarkProxyConfigurator() {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(toggle, new ObjectName("IAI mbeans", "name", "benchmark"));
    }

    @Override
    public Object wrapWithProxyIfNeeded(Object t, Class originalClass) {
        if (originalClass.isAnnotationPresent(Benchmark.class)) {
            return  Proxy.newProxyInstance(originalClass.getClassLoader(), originalClass.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (toggle.isEnabled()) {
                        System.out.println("************ BENCHMARK method "+method.getName()+" started **********");
                        long start = System.nanoTime();
                        Object retVal = method.invoke(t, args);
                        long end = System.nanoTime();
                        System.out.println(end-start);
                        System.out.println("************ BENCHMARK method "+method.getName()+" ended **********");
                        return retVal;
                    }else {
                        return method.invoke(t, args);
                    }
                }
            });
        }
        return t;
    }
}
