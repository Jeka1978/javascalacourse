package adapter

/**
  * @author Evgeny Borisov
  */
object PriceCalculator {
  def totalPrice(list: List[Pricable]):Int=list.map(_.price).sum
}
