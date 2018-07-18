package inheritance.traits

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val alexRunner = new AlexRunner()
    println("**********")
    val runner = new Runner{}

    println(runner.getClass)
    println(alexRunner.getClass)

  }
}
