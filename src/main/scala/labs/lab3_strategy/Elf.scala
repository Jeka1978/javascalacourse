package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Elf(val name: String) extends GameCharacter {
  override var hp: Int = getNumberBetween(min = 7, max = 9)
  override var power: Int = getNumberBetween(5, 7)

  override def kick(enemy: GameCharacter): Int = {
    if (enemy.power < power) {
      val damage = enemy.hp
      enemy.hp = 0
      damage

    } else {
      enemy.power -= 1
      0
    }
  }
}
