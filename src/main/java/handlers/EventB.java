package handlers;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class EventB implements Event {
   private long unitId;
   private String bbb;
   private String eventType;

}
