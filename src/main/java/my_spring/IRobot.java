package my_spring;


import lombok.Data;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */
@Data
public class IRobot {

    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @InjectRandomName
    private String name;


    public void cleanRoom() {
        speaker.sayMessage("my name is "+name);
        speaker.sayMessage("I started");
        cleaner.clean();
        speaker.sayMessage("I finished");
    }
}
