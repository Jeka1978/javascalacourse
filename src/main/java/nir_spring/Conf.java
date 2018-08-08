package nir_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@ComponentScan(basePackages = "my_spring")
@EnableScheduling
public class Conf {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Conf.class);
    }
}
