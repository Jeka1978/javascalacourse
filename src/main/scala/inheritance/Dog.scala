package inheritance

/**
  * @author Evgeny Borisov
  */
class Dog(val name: String) extends Animal(name) {

  println("***************")
  printName()

  override def makeVoice(): Unit = {
    println("au au")
  }

  override def printName(): Unit = {
    super.printName()
    println("dog " + name)

  }

  override def printName2(): Unit = {
    println("DOG@@@@2222")
  }
}
