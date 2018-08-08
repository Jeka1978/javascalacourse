package real_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Shakespear implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("2 b || ! 2 B");
    }
}
