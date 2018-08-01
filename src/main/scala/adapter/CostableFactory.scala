package adapter

import labs.lab3_strategy.ClassResolver
import adapter.RandomListFunctionsRegistry._

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
object CostableFactory {
  ClassResolver.setPackages("adapter")

  val costables: List[Class[_ <: Costable]] = ClassResolver.findAllClassesOfSubtype(classOf[Costable])
  def generateProduct(): Costable = {
    costables.randomItem().getConstructors.head.newInstance(Random.nextInt(10).asInstanceOf[Object]).asInstanceOf[Costable]
  }

  def generateProducts(amount:Int):List[Costable]={
    Range(0,amount).map(_=>generateProduct()).toList
  }
}
