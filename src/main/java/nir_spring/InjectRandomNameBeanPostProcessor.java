package nir_spring;

import my_spring.InjectRandomName;
import my_spring.InjectRandomNameObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomNameBeanPostProcessor implements BeanPostProcessor {

    private InjectRandomNameObjectConfigurator configurator = new InjectRandomNameObjectConfigurator();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configurator.configure(bean);
        return bean;

    }
}
