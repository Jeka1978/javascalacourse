package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Knight(val name: String) extends GameCharacter {
  override var hp: Int = getNumberBetween(8, 12)

  override var power: Int = getNumberBetween(10, 14)

  override def kick(enemy: GameCharacter): Int = {
    val damage = getNumberBetween(max = power)
    enemy.hp -= damage
    damage
  }
}
