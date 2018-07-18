import scala.util.Random

/**
  * @author Evgeny Borisov
  */
package object heroes {

  trait Fighter {
    def hp: Int

    def power: Int

    def takeDamage(fighter: Fighter, damage: Int): Unit

    def makeDamage(fighter: Fighter): Unit
  }

  abstract class AbstractFighter(var hp: Int, var power: Int) extends Fighter {
  }

  import RandomFactory._

  class Troll extends AbstractFighter(hp = random(10, 20), power = random(10, 20)) {
    override def takeDamage(fighter: Fighter, damage: Int): Unit = ???

    override def makeDamage(fighter: Fighter): Unit = ???
  }

  object RandomFactory {
    def random(from: Int, to: Int) = Random.nextInt(to - from) + from
  }

  class Z(a:Int,b:Long){}

  new Z(a = 2,3)

  A(20, 1).copy(q = 0)

  class A(q: Int=2, w: Double) extends Product2[Int, Double] {

    override def _1: Int = q

    override def _2: Double = w

    override def canEqual(that: Any): Boolean = that.getClass == classOf[A]

    //...

    def copy(q: Int = this.q, w: Double = this.w) = A(q, w)
  }

  object A {
    def apply(q: Int, w: Double): A = new A(q, w)
  }

}
