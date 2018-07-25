package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Sword extends Weapon {
  override def fight(fighter: GameCharacter, enemy: GameCharacter): Int = {
    val damage = RandomFactory.getNumberBetween(max = fighter.power)
    enemy.hp -= damage
    damage
  }
}
