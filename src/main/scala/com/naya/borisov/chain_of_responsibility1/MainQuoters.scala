package com.naya.borisov.chain_of_responsibility1

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
  * @author Evgeny Borisov
  */
object MainQuoters {
  def main(args: Array[String]): Unit = {
    val context = new AnnotationConfigApplicationContext("com.naya.borisov.chain_of_responsibility1")

    context.getBean("mainQuoter").asInstanceOf[QuoterPrintersHolder]
      .printAllQuotes()
  }

}
