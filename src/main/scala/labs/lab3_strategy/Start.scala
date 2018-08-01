package labs.lab3_strategy

import labs.lab3_strategy.RandomFactory._

/**
  * @author Evgeny Borisov
  */
object Start {
  def main(args: Array[String]): Unit = {
    println(generateRandomCharacter())
    println(generateRandomCharacter())
    println(generateRandomCharacter())
    println(generateRandomCharacter())
    println(generateRandomCharacter())
    println(generateRandomCharacter())
    println(generateRandomCharacter())
//      GameManager.playGame(generateRandomCharacter(),generateRandomCharacter())
  }
}
