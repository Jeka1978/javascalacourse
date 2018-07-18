package handlers;

/**
 * @author Evgeny Borisov
 */
public interface Event {
    long getUnitId();
    String getEventType();
}
