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
  val characterClasses = ClassScanner.findSubtypes(classOf[GameCharacter])
  def generateRandomCharacter():GameCharacter={
    val i = Random.nextInt(characterClasses.length)
    val characterClass = characterClasses(i)
    val constructor = characterClass.getConstructors.head
    if(constructor.getParameterCount==0) {
      characterClass.newInstance()
    }else{
       constructor.newInstance(datafactory.getName).asInstanceOf[GameCharacter]
    }
  }
}






