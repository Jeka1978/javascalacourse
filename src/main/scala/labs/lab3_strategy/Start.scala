package labs.lab3_strategy

/**
  * @author Evgeny Borisov
  */
object Start {
  def main(args: Array[String]): Unit = {
    val hobbit = new Hobbit("Merry")
    println(hobbit)
    val knight = new Knight("Lasncelot")
    println(knight)
    println(s"damage ${knight.kick(hobbit)}")
    println(hobbit)
    hobbit.kick(knight)
  }
}
