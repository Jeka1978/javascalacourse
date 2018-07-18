package scala_simple_examples

/**
  * @author Evgeny Borisov
  */
object AlexService {

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
