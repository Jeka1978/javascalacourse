package handlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Evgeny Borisov
 */
public interface EventEnricher<T extends Event> {
    @SneakyThrows
    default Event enrich(String json, String eventType) {
        ObjectMapper mapper = new ObjectMapper();
        Object o = mapper.readValue(json, Class.forName(eventType));
        return enrichCurrent((T) o);
    }

    Event enrichCurrent(T event);

   default String eventType(){
       String typeName = ((ParameterizedType) getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0].getTypeName();
       String[] split = typeName.split("\\.");
       return split[split.length - 1];
   }
}
