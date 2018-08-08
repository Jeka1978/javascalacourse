package nir_spring;

import my_spring.Cleaner;
import my_spring.InjectByType;
import my_spring.InjectRandomName;
import my_spring.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class IRobot {

    @Autowired
    private Speaker speaker;
    @Autowired
    private Cleaner cleaner;

    @InjectRandomName
    private String name;


    @Scheduled(fixedDelay = 1000)
    public void cleanRoom() {
        speaker.sayMessage("my name is "+name);
        speaker.sayMessage("I started");
        cleaner.clean();
        speaker.sayMessage("I finished");
    }
}
