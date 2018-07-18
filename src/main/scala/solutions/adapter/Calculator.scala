package solutions.adapter

/**
  * @author Evgeny Borisov
  */
object Calculator extends App {
  def calc(pricables: List[Pricable]):Int={
    pricables.map(a=>a.price).sum
  }

  val costables: List[Costable] = ItemFactory.generate(5)

}
