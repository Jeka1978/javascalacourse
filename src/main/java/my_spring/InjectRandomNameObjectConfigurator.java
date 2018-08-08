package my_spring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameObjectConfigurator implements ObjectConfigurator {
    private DataFactory dataFactory = new DataFactory();
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomName.class)) {
                field.setAccessible(true);
                field.set(t,dataFactory.getName());
            }
        }
    }
}
