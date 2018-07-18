package labs.lab2

/**
  * @author Evgeny Borisov
  */
object TalkingRobot {
  var quoters:List[Quoter] =  List(RandomQuoter,
    new ShakespearQuoter(),
    MessageQuoter("Good to die for our country"))

  def addQuoter(quoter: Quoter):Unit={
    quoters = quoter::quoters
  }

  def talk():Unit={
    quoters.foreach(_.printMessage())
  }
}
