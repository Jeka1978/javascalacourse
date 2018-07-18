package com.naya.borisov.chain_of_responsibility1

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

import scala.collection.JavaConverters.asScalaBufferConverter

/**
  * @author Evgeny Borisov
  */
@Component("mainQuoter")
class QuoterPrintersHolder(quoters:java.util.List[QuotePrinter]) {

  @Scheduled(fixedDelay = 1000*60)
  def printAllQuotes():Unit={
    quoters.asScala.foreach(_.printQuote())

  }
}
