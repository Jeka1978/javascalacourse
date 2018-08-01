/**
  * @author Evgeny Borisov
  */
package object adapter {

  trait Costable {
    def cost: Int
  }

  case class Chair(cost: Int) extends Costable

  case class Table(cost: Int) extends Costable

  case class Car(cost: Int) extends Costable

  case class House(cost: Int) extends Costable

}
