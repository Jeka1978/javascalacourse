package inheritance.traits

/**
  * @author Evgeny Borisov
  */
package object animals {

  case class Dinozaur(name: String) extends Animal
  class Cat(val name:String) extends Animal

  class Horse extends Animal {
    override def name: String = "Horse"
  }

}
