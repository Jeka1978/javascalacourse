package com.naya.borisov.chain_of_responsibility1

import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
@Order(3)
class TerminatorQuoter extends QuotePrinter {
  override def printQuote(): Unit = println("I'll be back")

}
