package solutions.quoters

/**
  * @author Evgeny Borisov
  */
object Start extends App {

  private val quoters = List(RandomQuoter,new ShakespearQuoter(),MessageQuoter("hi"))
  quoters.foreach(q=> println(q.message))
}
