package inheritance.anonymous

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val button =  Button
    button.addListener(new Listener {
      override def mouseReleased(): Unit = ???

      override def mouseClicked(): Unit = ???
    })
  }
}
