package relfections

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class EventCDEnricher extends EventEnricher[EventA] {


  override def myEvents(): Set[Class[_ <: Event]] = {
    Set(classOf[EventC],classOf[EventD])
  }

  override def enrich(event: EventA): EventA = {
    event
  }
}
