package solutions

import org.fluttercode.datafactory.impl.DataFactory
import solutions.quoters.RandomQuoter.message

/**
  * @author Evgeny Borisov
  */
package object quoters {

  trait Quoter {
    def message: String
  }

  object RandomQuoter extends Quoter {
    override def message: String = {
      new DataFactory().getRandomText(10)
    }

    def printMessage(): Unit = println(message)
  }

  class ShakespearQuoter(var message: String = "2 b || ! 2 b") extends Quoter {
    def printMessage(): Unit = println(message)
  }
  object ShakespearQuoter{
    def unapply(arg: ShakespearQuoter): Option[String] = Some(arg.message)
  }

  case class MessageQuoter(message: String) extends Quoter


}



