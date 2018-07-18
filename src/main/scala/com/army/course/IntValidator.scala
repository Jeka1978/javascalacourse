package com.army.course

/**
  * @author Evgeny Borisov
  */
class IntValidator extends Validator {
  override def validate(data: Data): Unit = {
    if (data.num == 0) {
      println("can't be 0")
    }
  }
}
