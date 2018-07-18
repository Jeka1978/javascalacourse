package inheritance

/**
  * @author Evgeny Borisov
  */
abstract class Animal(name: String) {

  printName()

  def makeVoice(): Unit

  def printName(): Unit = {
    println("animal "+name)
    printName2()
  }
  def printName2(): Unit = {
    println("animal2222222 "+name)
  }


}
