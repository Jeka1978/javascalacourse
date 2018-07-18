package solutions.lab0

import com.naya.borisov.chain_of_responsibility2.Person

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    println("hello world") //one line comment
    val name = "Alex"
    println("Hello " + name)
    /* block of
     comments*/
    println(s"Hello $name")
    println(s"Hello ${name + " !"}")
    val person = new Person(name = "k", age = 3)
  }

  class Person(name: String = "default from class", var age: Int = 18) extends PersonState {
    println("person was created " + getClass)
//    val name


    override def toString: String = name + " " + age
  }

}
