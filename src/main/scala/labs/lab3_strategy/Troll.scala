package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Troll extends GameCharacter {
  override var hp: Int = getNumberBetween(100, 120)
  override var power: Int = getNumberBetween(30, 40)
  override val name: String = "Oar"
  private val weapon: Weapon = new Sword

  override def kick(enemy: GameCharacter): Int = {
    weapon.fight(this,enemy)
  }
}
