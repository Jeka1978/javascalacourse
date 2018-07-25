package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
trait Weapon {
  def fight(fighter: GameCharacter, enemy: GameCharacter):Int

}
