package com.naya.borisov.chain_of_responsibility1

import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
@Order(2)
class ShakespearQuoter extends QuotePrinter {
  override def printQuote(): Unit = {
    println("2 b || ! 2 b")
  }
}
