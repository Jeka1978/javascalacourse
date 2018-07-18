package labs

import org.fluttercode.datafactory.impl.DataFactory
import solutions.quoters.ShakespearQuoter

/**
  * @author Evgeny Borisov
  */
package object lab2 {

  trait Quoter{
    def printMessage():Unit
  }

  trait Worker{
    def work()
  }

  object RandomQuoter extends Quoter with Worker {
    val factory = new DataFactory()

    def abc():Unit={
      println("abc")
    }
    override def printMessage(): Unit = {
      val text = factory.getRandomText(20)
      println(text)
    }

    override def work(): Unit = println("working")
  }

  class ShakespearQuoter(val message:String="2 B || ! 2 B") extends Quoter {
    override def printMessage(): Unit = println(message)


  }
  object ShakespearQuoter{
    def unapply(arg: ShakespearQuoter): Option[String] = {
      Some(arg.message)
    }

  }

  case class MessageQuoter(message:String) extends Quoter {
    override def printMessage(): Unit = println(message)
  }













}

