package scala_simple_examples

import com.naya.borisov.chain_of_responsibility2.Person
import labs.lab3_strategy.Troll

/**
  * @author Evgeny Borisov
  */
object AlexService {

  def generateObject[T](clazz: Class[T]):T={
    clazz.newInstance()
  }

  def doX():Unit={
    val troll: Troll = generateObject(classOf[Troll])
    troll.kick(troll)
  }




  def createPerson(name: String = ""): Person = {
    new Person(12, name)
  }
















  def main(args: Array[String]): Unit = {

    new Person(age = 12, name = "")
    new Person(age = 12, name = "")
    val person = new Person(name = "Alex", age = 10)
    person.printMyAge()
    person.printMyAge()
    println(person.salary)
    person
  }
}
