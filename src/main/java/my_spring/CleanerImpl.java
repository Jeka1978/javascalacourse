package my_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class CleanerImpl implements Cleaner {

    @Override
    public void clean() {
        System.out.println("VVVVVVVVVvvvvvvvvvvvvvvv");
    }
}
