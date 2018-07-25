package labs.lab3_strategy

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
trait GameCharacter {
  var hp: Int
  var power: Int
  val name: String

  def isAlive: Boolean = hp > 0

  def kick(enemy: GameCharacter): Int

  override def toString: String = s"${getClass.getSimpleName} $name hp:$hp power:$power alive:$isAlive"

  def getNumberBetween(min: Int = 0, max: Int): Int = {
    RandomFactory.getNumberBetween(min,max)
  }
}




