import scala.language.implicitConversions

/**
  * @author Evgeny Borisov
  */
package object dymamism {
  object RichString {
    implicit def bindIsBlank(string: String) = {
      new RichString(string)
    }
  }

  class RichString(string: String) {
    def isBlank = null == string || string.isEmpty
  }


}
