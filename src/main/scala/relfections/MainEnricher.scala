package relfections

import javax.annotation.PostConstruct
import org.springframework.stereotype.Service
import scala.collection.JavaConverters.asScalaBufferConverter

/**
  * @author Evgeny Borisov
  */
@Service
class MainEnricher(list: java.util.List[EventEnricher[_]]) {
  var map: Map[String, EventEnricher[_]] = Map()

  @PostConstruct
  def initMap(): Unit = {
    println()
    list.asScala.foreach(enricher => enricher.myEvents()
      .foreach(event => map += (event.getSimpleName -> enricher)))
  }

  def enrich(event: Event): Unit = {

//    map(event.eventType).enrich(event)
  }
}
