package com.army.course

/**
  * @author Evgeny Borisov
  */
class StringValidator extends Validator {
  override def validate(data: Data): Unit ={
    if(data.name==null) {
      println("can't be null")
    }
  }
}
