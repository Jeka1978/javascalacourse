package com.naya.borisov.method_implicit

trait Enricher {
  def enrich(event: EventA): EventA = event

  def enrich(event: EventB): EventB = event
}
