package pimp_my_library

/**
  * @author Evgeny Borisov
  */
object CustomFunctionsBiner {
  implicit def intWithTimes(n: Int) = new {
    def times(f: => Unit) = 1 to n foreach { _ => f }
  }


}
