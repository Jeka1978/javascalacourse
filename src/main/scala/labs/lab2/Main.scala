package labs.lab2

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    TalkingRobot.talk()
    println("**********")
//    TalkingRobot.addQuoter(() => println("I'll be back"))
    TalkingRobot.addQuoter(new Quoter {
      override def printMessage(): Unit = println("I'll be back")
    })
  }
}
