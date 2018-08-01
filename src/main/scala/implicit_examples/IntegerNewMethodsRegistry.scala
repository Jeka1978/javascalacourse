package implicit_examples

/**
  * @author Evgeny Borisov
  */
object IntegerNewMethodsRegistry {
    implicit def wrapIntegerWithSuperDuperInteger(num:Int):SuperDuperInteger={
      new SuperDuperInteger(num)
    }
}
