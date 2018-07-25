package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
object GameManager {

  def playGame(c1: GameCharacter,c2: GameCharacter):Unit={
    while (c1.isAlive && c2.isAlive) {
      println(c1.kick(c2))
      println(c2.kick(c1))
    }
  }

}
