package com.naya.borisov.chain_of_responsibility3

import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
@Order(2)
class AlchogolicEnrichmentator extends Enrichmentator {
  override def enrich(data: Map[String, Int]): Map[String, Int] = {
    if (data("Leff") > 1) data + ("Alchogolic" -> 10) else data
  }
}
