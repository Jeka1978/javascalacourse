package real_spring;

import my_spring.IRobot;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(basePackages = "real_spring")
@PropertySource("classpath:quotes.properties")
@EnableScheduling
@EnableAspectJAutoProxy
public class MyConf {

    @Bean
    public IRobot iRobot(){
        return new IRobot();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
    }
}
