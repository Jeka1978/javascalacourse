package labs.lab3_strategy

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
object RandomFactory {
  def getNumberBetween(min: Int = 0, max: Int): Int = {
    min + Random.nextInt(max - min) + 1
  }
}
