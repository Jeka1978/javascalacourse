package inheritance.traits

/**
  * @author Evgeny Borisov
  */
class AlexRunner extends Runner {
  println("Alex runner was created")

  override def run(): Unit = println("Alex never run, he always comes on time")
}
