package relfections

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.databind.ObjectMapper
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import org.springframework.context.annotation.AnnotationConfigApplicationContext


/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val json = "{\"unitId\": 2,\"eventType\":\"EventA\",  \"value\": 10,\"aValue\":\"yes\"}"
    val mapper = new ObjectMapper()
    //    mapper.setVisibility(mapper.getSerializationConfig.getDefaultVisibilityChecker.withFieldVisibility(JsonAutoDetect.Visibility.ANY).withGetterVisibility(JsonAutoDetect.Visibility.NONE).withSetterVisibility(JsonAutoDetect.Visibility.NONE).withCreatorVisibility(JsonAutoDetect.Visibility.NONE))

    val value = decode[EventA](json)
    value match {
      case Right(event) => println(event)
    }

    val context = new AnnotationConfigApplicationContext("relfections")
    val enricher = context.getBean(classOf[MainEnricher])
    enricher.enrich(null)
  }
}
