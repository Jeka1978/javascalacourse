package handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainEnricher {
    private Map<String,EventEnricher> map = new HashMap<>();
    @Autowired
    private void setMap(List<EventEnricher> enrichers) {
        for (EventEnricher enricher : enrichers) {
            map.put(enricher.eventType(), enricher);
        }
    }


    public void handleEvents(String json, String eventType) {

        map.get(eventType).enrich(json,  this.getClass().getPackage().getName()+"."+eventType);
    }

    public static void main(String[] args) {
        String json = "{\"unitId\": 2,\"eventType\":\"EventB\",\"bbb\":\"yes\"}";
        MainEnricher mainEnricher = new AnnotationConfigApplicationContext("handlers").getBean(MainEnricher.class);
        mainEnricher.handleEvents(json,"EventB");
    }
}
