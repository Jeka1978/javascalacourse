package com.naya.borisov.chain_of_responsibility2

import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
trait PersonValidator {
  def validate(person: Person): String
}

@Component
@Order(2)  // just checking if will it work - and yes, it works exactly like in java
class AgeValidator extends PersonValidator {
  override def validate(person: Person) = {
    person.age match {
      case x if x < 0 => "age can't be negative"
      case x if x < 18 => "not adult"
      case _ => ""
    }
  }

  @Component
  @Order(1)
  class NameValidator extends PersonValidator {
    override def validate(person: Person) = {
      person.name match {
        case null => "name can't be null"
        case "" => "name can't be empty"
        case name if name.length > 10 => "name is too long"
        case _ => ""
      }
    }
  }

}