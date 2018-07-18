package solutions.lab0

import solutions.lab0.Main.Person

/**
  * @author Evgeny Borisov
  */
object PersonService {
  println("I was created")
  def processPerson(person:Person):Unit={
    println(person)
  }
  def dox()={}

  def apply(): Person = new Person(name = "Vasya")

  def main(args: Array[String]): Unit = {

    val john = new Person(age = 12,name = "John")
    val jack = new Person("Jack")
    val ivan = new Person(age = 30)
    val mali = new Person(name = "Mali")
  }
}

