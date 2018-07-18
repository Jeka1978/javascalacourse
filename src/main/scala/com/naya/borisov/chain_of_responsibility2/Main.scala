package com.naya.borisov.chain_of_responsibility2

import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val person = Person(age = 15,name = "Fistadantilus")
    val context = new AnnotationConfigApplicationContext("com.naya.borisov.chain_of_responsibility2")
    val mainValidator = context.getBean("mainValidator").asInstanceOf[PersonMainValidator]
    val errors:List[String] = mainValidator.validate(person)
    errors.foreach(error=>println(error))
  }
}
