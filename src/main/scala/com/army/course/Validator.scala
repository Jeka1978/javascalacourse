package com.army.course

/**
  * @author Evgeny Borisov
  */
trait Validator {
    def validate(data: Data):Unit
}
