package labs.lab3_strategy

import java.util


import org.reflections.Reflections
import scala.collection.JavaConverters._

/**
  * @author Evgeny Borisov
  */
object ClassScanner {
  val reflections = new Reflections("labs.lab3_strategy")

  def findSubtypes[T](clazz: Class[T]):List[Class[_<:T]] = {



    val strings = new util.ArrayList[String]()
    strings.asScala


    val set: util.Set[Class[_ <: T]] = reflections.getSubTypesOf(clazz)
    set.asScala.toList
  }

}
