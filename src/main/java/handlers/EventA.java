package handlers;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class EventA implements Event {
   private long unitId;
   private String aaa;
   private String eventType;


}
