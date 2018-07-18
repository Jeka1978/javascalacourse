package pimp_my_library

import pimp_my_library.CustomStringBinder.bind

/**
  * @author Evgeny Borisov
  */
object Start {
  def main(args: Array[String]): Unit = {
    val str = "java@."
    println(str.isNotBlank)
    println(str.email)
  }

}
