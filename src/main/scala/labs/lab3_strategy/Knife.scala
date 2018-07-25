package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Knife extends Weapon {
  override def fight(fighter: GameCharacter, enemy: GameCharacter): Int = {
    enemy.hp-=1
    1
  }
}
