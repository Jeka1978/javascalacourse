package relfections

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class EventBEnricher extends EventEnricher[EventB] {


  override def myEvents(): Set[Class[_ <: Event]] = {
    Set(classOf[EventB])
  }

  override def enrich(event: EventB): EventB = {
    event
  }
}
