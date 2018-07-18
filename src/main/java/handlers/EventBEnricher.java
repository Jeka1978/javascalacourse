package handlers;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EventBEnricher<T extends Event> implements EventEnricher<EventB> {
    @Override
    public Event enrichCurrent(EventB event) {
        System.out.println("handling BBB");
        System.out.println(event.getBbb());
        return event;
    }
}
