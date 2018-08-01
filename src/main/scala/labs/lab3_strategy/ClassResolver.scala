package labs.lab3_strategy

import java.util

import org.reflections.Reflections

import scala.collection.JavaConverters._
import scala.collection.mutable

/**
  * @author Evgeny Borisov
  */
object ClassResolver {
    private var scanner = new Reflections("labs.lab3_strategy")

    def setPackages(packageName:String):Unit=scanner=new Reflections(packageName)

    def findAllClassesOfSubtype[T](clazz:Class[T]): List[Class[_<:T]] ={

      new util.HashSet[String]().asScala
      val set: util.Set[Class[_ <: T]] = scanner.getSubTypesOf(clazz)
      val scala: mutable.Set[Class[_ <: T]] = set.asScala
      scala.toList
    }
}
