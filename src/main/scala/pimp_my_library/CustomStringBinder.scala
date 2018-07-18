package pimp_my_library

/**
  * @author Evgeny Borisov
  */
object CustomStringBinder {

  implicit def bind(string: String): CustomString = {
    new CustomString(string)
  }
}
