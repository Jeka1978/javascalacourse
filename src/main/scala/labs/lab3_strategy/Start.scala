package labs.lab3_strategy

import labs.lab3_strategy.RandomFactory._

/**
  * @author Evgeny Borisov
  */
object Start {
  def main(args: Array[String]): Unit = {
      GameManager.playGame(generateRandomCharacter(),generateRandomCharacter())
  }
}
