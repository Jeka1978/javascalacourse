package adapter

/**
  * @author Evgeny Borisov
  */
object RandomListFunctionsRegistry {
 implicit def wrapScalaListWithCustomList[T](list: List[T]):RandomList[T]=new RandomList[T](list)
}
