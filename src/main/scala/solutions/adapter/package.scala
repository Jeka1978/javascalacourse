package solutions

/**
  * @author Evgeny Borisov
  */
package object adapter {
  trait Costable{
    def cost:Int
  }


  object Item extends Enumeration{
    val BOOK = Book()
    val SHELF = Shelf()
    val CUPBOARD = Cupboard()
    val ROOM = Room()
    case class Book(cost:Int=10) extends Val with Costable
    case class Shelf(cost:Int=200) extends Val with Costable
    case class Cupboard(cost:Int=1000) extends Val with  Costable
    case class Room(cost:Int=20000) extends Val with  Costable

    override def toString(): String = getClass.toString
  }



}
