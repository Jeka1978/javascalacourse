package solutions.quoters

import javax.swing.JOptionPane
import pimp_my_library.CustomFunctionsBiner._

/**
  * @author Evgeny Borisov
  */
object QuoterManager {
  def useQuoter(quoter: Quoter): Unit = {
    quoter match {
      case rq: RandomQuoter.type =>
        intWithTimes(10).times(rq.printMessage())


      case sq@ShakespearQuoter(a) =>
        sq.message = a.toUpperCase
        sq.printMessage()
      case MessageQuoter(msg) => JOptionPane.showMessageDialog(null, msg)
    }
  }

  def main(args: Array[String]): Unit = {
    val quoter1 = MessageQuoter("I love scala")
    val quoter2 = new ShakespearQuoter("to b or not")
    val quoter3 = RandomQuoter
    QuoterManager.useQuoter(quoter3)
  }

}
