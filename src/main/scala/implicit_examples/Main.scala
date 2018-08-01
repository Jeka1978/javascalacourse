package implicit_examples

import implicit_examples.IntegerNewMethodsRegistry._
/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val i:Int = 3
    val integer: SuperDuperInteger = new SuperDuperInteger(i)
    println(integer.doubleYourself())
  }
}
