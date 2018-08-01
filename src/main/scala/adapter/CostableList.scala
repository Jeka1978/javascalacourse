package adapter

/**
  * @author Evgeny Borisov
  */
class CostableList(list: List[Costable]) {
  def asPricableList(): List[Pricable] = {
    list.map(costable => new Pricable {
      override def price: Int = costable.cost
    })
  }
}
