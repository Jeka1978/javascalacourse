package handlers;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EventAEnricher<T extends Event> implements EventEnricher<EventA> {
    @Override
    public Event enrichCurrent(EventA event) {
        System.out.println("handling aaaa");
        System.out.println(event.getAaa());
        return event;
    }
}
