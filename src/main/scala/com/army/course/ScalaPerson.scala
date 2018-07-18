package com.army.course

/**
  * @author Evgeny Borisov
  */
class ScalaPerson(var name: String, private var _age: Int) {

  def age: Int = _age // Getter for age

  def age(newAge: Int): Unit = { // Setter for age
    println(s"Changing age to: $newAge")
    _age = newAge
  }
}
