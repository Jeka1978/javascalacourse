package labs.lab2

import javax.swing.JOptionPane

/**
  * @author Evgeny Borisov
  */
object QuoterManager {
  def useQuoter(quoter: Quoter) = {
    quoter match {
      case rq: RandomQuoter.type => {
        for (i <- 1 to 10) {
          rq.abc()
          rq.printMessage()
          //          quoter.asInstanceOf[RandomQuoter.type].abc()
        }
      }
      case MessageQuoter(msg) => println(msg.toUpperCase())
      case ShakespearQuoter(msg) => JOptionPane.
        showMessageDialog(null, msg)
    }
  }
  def main(args: Array[String]): Unit = {
      QuoterManager.useQuoter(MessageQuoter("I need to go"))
  }



}
