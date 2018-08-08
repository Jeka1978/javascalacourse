package my_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Benchmark
@Component
public class ConsoleSpeaker implements Speaker {
    @Override
    public void sayMessage(String message) {
        System.out.println(message);
    }
}
