package solutions.adapter

/**
  * @author Evgeny Borisov
  */
case class Costable2PricableAdapter(costable: Costable) extends Pricable {
  override def price: Int = costable.cost
}
