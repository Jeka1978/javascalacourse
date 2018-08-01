package adapter

/**
  * @author Evgeny Borisov
  */
case class C2PAdapter(costable: Costable) extends Pricable {
  override def price: Int = costable.cost
}
