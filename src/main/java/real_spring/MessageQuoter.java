package real_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class MessageQuoter implements Quoter {

    @Value("${msg}")
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
