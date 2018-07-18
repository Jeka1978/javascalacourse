package com.naya.borisov.method_implicit

class Field1Enricher extends Enricher {
  override def enrich(event: EventA): EventA = event.copy(field1 = Some("Some text " + event.name))
}
