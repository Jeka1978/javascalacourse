package com.naya.borisov.chain_of_responsibility3

import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
trait Enrichmentator {
  def enrich(data:Map[String,Int]):Map[String,Int]
}

@Component
@Order(1)
class BeerEnrichmentator extends Enrichmentator {
  override def enrich(data: Map[String, Int]):Map[String,Int] = {
    data+("Leff"->2)
  }
}
