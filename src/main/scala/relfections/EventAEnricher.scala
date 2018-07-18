package relfections

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class EventAEnricher extends EventEnricher[EventA] {
  override def enrich(event: EventA): EventA = {
    println(event)
    event
  }

  override def myEvents(): Set[Class[_ <: Event]] = {
    Set(classOf[EventA])
  }
}
