package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Knight(val name: String) extends GameCharacter {
  override var hp: Int = getNumberBetween(8, 12)

  override var power: Int = getNumberBetween(10, 14)

  private var weapon:Weapon = new Sword

  override def kick(enemy: GameCharacter): Int = {
    if(power<10){
      println("I'm tired to fight with my sword, lets take a knife")
      weapon = new Knife
    }
    weapon.fight(this,enemy)
  }
}




