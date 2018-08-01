package adapter

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
class RandomList[T](list: List[T]) {
  def randomItem():T={
    list(Random.nextInt(list.length))
  }
}
