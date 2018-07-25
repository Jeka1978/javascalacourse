package labs.lab3_strategy

import org.fluttercode.datafactory.impl.DataFactory

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
object RandomFactory {
  private val datafactory:DataFactory = new DataFactory
  def getNumberBetween(min: Int = 0, max: Int): Int = {
    min + Random.nextInt(max - min) + 1
  }
  val characterClasses = List(classOf[Troll],classOf[Knight],classOf[Hobbit],classOf[Elf])

  def generateRandomCharacter():GameCharacter={
    val i = Random.nextInt(characterClasses.length)
    val characterClass = characterClasses(i)
    val contructor = characterClass.getConstructors.head
    if(contructor.getParameterCount==0) {
      characterClass.newInstance()
    }else{
       contructor.newInstance(datafactory.getName).asInstanceOf[GameCharacter]
    }
  }
}






