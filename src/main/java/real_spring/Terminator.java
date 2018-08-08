package real_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Terminator implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("I'll be back");
    }
}
