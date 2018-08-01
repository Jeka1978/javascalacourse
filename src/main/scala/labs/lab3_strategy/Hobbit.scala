package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
class Hobbit(val name:String) extends GameCharacter {


  override var hp: Int = 3
  override var power: Int = 3

  def cry(): Unit = println("au au au a")

  override def kick(enemy: GameCharacter): Int ={
    cry()
    0
  }
}
