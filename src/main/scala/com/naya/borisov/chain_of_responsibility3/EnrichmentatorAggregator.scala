package com.naya.borisov.chain_of_responsibility3

import org.springframework.stereotype.Component

import scala.collection.JavaConverters.asScalaBufferConverter

/**
  * @author Evgeny Borisov
  */
@Component("enricher")
class EnrichmentatorAggregator(enrichmentator: java.util.List[Enrichmentator]) {
  def enrichAll(data:Map[String,Int]):Map[String,Int]={
    var tempData = data
    enrichmentator.asScala.foreach(enrichmentator=>tempData=enrichmentator.enrich(tempData))
    tempData
  }
}
