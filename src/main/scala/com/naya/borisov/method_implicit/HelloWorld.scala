package com.naya.borisov.method_implicit

import java.time.LocalDateTime

import scala.collection.immutable.List

object HelloWorld extends App {
  private val data = Seq(
    JsonElement("A", 1, "A1", LocalDateTime.now()),
    JsonElement("A", 2, "A2", LocalDateTime.now()),
    JsonElement("B", 3, "B1", LocalDateTime.now()),
    JsonElement("A", 4, "A3", LocalDateTime.now()),
    JsonElement("B", 5, "B2", LocalDateTime.now()),
    JsonElement("A", 6, "A4", LocalDateTime.now()),
    JsonElement("B", 7, "B3", LocalDateTime.now()),
    JsonElement("A", 8, "A5", LocalDateTime.now()),
    JsonElement("A", 9, "A6", LocalDateTime.now()),
    JsonElement("B", 10, "B4", LocalDateTime.now()),
    JsonElement("A", 11, "A7", LocalDateTime.now())
  )

  private val enrichers = Seq(
    new Field1Enricher,
    new Field2Enricher,
    new Field3Enricher

  )
  List.apply(1)
  data.map(_.toEvent).foreach {
    case e: EventA => println(enrichers.foldRight(e)((f, a) => f.enrich(a)))
    case e: EventB => println(enrichers.foldRight(e)((f, b) => f.enrich(b)))
    case _ => throw new IllegalArgumentException("Unknown event type")
  }
}
