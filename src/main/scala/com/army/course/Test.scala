package com.army.course

import java.util.ServiceLoader

import scala.collection.JavaConverters._

/**
  * @author Evgeny Borisov
  */
object Test extends App {
  val data = Data(null, 0)

  ServiceLoader.load(classOf[Validator]).asScala.foreach(e => e.validate(data))
}