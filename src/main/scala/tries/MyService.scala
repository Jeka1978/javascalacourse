package tries

/**
  * @author Evgeny Borisov
  */
object MyService {
  val x: Int = 12
  init


  def apply(x: Int = 0, y: Int = 0): Point = {
    if (x < 0)
      throw new IllegalStateException("x can't be negative")
    new Point()
  }


  private def init(): Unit = {
    println(x)
    println("my service was created")
  }

  def doWork(): Unit = {
    println("work")
  }

  def main(args: Array[String]): Unit = {
    val point12 = new Point(x = 3, y = 4)
    val point = MyService(x = 3, y = 4)
    val point2 = MyService.apply(x = 3, y = 4)
    MyService.doWork()

  }


}
