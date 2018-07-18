package com.naya.borisov.method_implicit

class Field2Enricher extends Enricher {
  var lastA: Option[EventA] = None

  override def enrich(event: EventA): EventA = {
    lastA = Some(event)

    event
  }

  override def enrich(event: EventB): EventB = event.copy(field2 = lastA.map(e => e.index.toDouble))
}
