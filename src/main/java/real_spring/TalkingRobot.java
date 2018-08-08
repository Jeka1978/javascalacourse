package real_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class TalkingRobot {
    @Autowired
    private List<Quoter> quoters;


//    @Scheduled(cron = "1/1 * * * * ? ")
    @Scheduled(fixedDelay = 1000)
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
