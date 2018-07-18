package com.naya.borisov.chain_of_responsibility1

import org.springframework.context.annotation.{Bean, ComponentScan, Configuration}

/**
  * @author Evgeny Borisov
  */
@Configuration
@ComponentScan
class QuotersConf {

 /* @Bean
  def springQuoter():QuotePrinter={
    new QuotePrinter {
      override def printQuote(): Unit = println("Spring is everywhere")
    }
  }*/
}
