package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Ork extends GameCharacter {
  override var hp: Int = getNumberBetween(10, 20)
  override var power: Int = getNumberBetween(3, 7)
  override val name: String = "Buz"
  private val weapon: Weapon = new Sword

  override def kick(enemy: GameCharacter): Int = {
    weapon.fight(this,enemy)
  }
}
