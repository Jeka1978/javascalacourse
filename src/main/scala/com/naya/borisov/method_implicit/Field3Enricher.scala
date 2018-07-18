package com.naya.borisov.method_implicit

class Field3Enricher extends Enricher {
  override def enrich(event: EventB): EventB = event.copy(field3 = event.field3.map(e => e + 100).orElse {
    Some(System.currentTimeMillis())
  })
}
