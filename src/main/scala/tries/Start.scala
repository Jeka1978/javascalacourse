package tries

/**
  * @author Evgeny Borisov
  */
object Start {
  def main(args: Array[String]): Unit = {
    val jeka = Human.apply("Jeka")
    val jeka2 = Human("Jeka")
    val jeka3 = new Human("Jeka")


    println(jeka)
    println(jeka == jeka2)
    jeka.name = jeka.name.toUpperCase()
    println(jeka == jeka2)
  }

}
