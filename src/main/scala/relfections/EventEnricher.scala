package relfections
import io.circe.generic.auto._
import io.circe.parser._
/**
  * @author Evgeny Borisov
  */
trait EventEnricher[T] {
  def enrich(event: T): T

  //  def myEvents(): Set[String]
  def myEvents(): Set[Class[_ <: Event]]

  final def enrich(event: Event): T = {
    val json = "{\"unitId\": 2,\"eventType\":\"EventA\",  \"value\": 10,\"aValue\":\"yes\"}"

    val value = decode[EventA](json)
    value match {
      case Right(event) => println(event)
    }
    val a: T = event.asInstanceOf[T]
    enrich(a)
  }
}
