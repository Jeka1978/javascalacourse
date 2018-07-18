package inheritance.anonymous

/**
  * @author Evgeny Borisov
  */
object Button {


  def addListener(listener: Listener): Unit = {
    val list: List[Listener] = Nil
    listener :: list
  }

  def main(args: Array[String]): Unit = {
    var strings: List[String] = List("groovy")
    strings = "java" :: strings
    println(strings)
  }
}
