package pimp_my_library

/**
  * @author Evgeny Borisov
  */
class CustomString(string: String) {

  def email: Boolean = {
    string.contains("@") && string.contains(".")
  }

  def isNotBlank: Boolean = {
    string != null && string.isEmpty
  }
}
