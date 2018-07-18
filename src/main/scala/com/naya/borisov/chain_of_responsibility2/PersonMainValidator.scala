package com.naya.borisov.chain_of_responsibility2

import org.springframework.stereotype.Component

import scala.collection.JavaConverters.iterableAsScalaIterableConverter

/**
  * @author Evgeny Borisov
  */
@Component("mainValidator")
class PersonMainValidator(validators: java.util.List[PersonValidator]) {
  def validate(person: Person):List[String]={
    validators.asScala.map(_.validate(person)).filter(!_.isEmpty).toList
  }
}
