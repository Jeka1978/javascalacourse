package scala_simple_examples

/**
  * @author Evgeny Borisov
  */
object StartService {

  def main(args: Array[String]): Unit = {
    val person = AlexService.createPerson("Alex")
    println(person)
  }


}
