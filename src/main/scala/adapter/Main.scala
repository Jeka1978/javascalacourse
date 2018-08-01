package adapter
import adapter.CostableListExtensionsRegistry._
/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val list = Range(1, 10).map(_ => C2PAdapter(CostableFactory.generateProduct())).toList
    println(PriceCalculator.totalPrice(list))

    val pricables = CostableFactory.generateProducts(10).asPricableList()
    println(PriceCalculator.totalPrice(pricables))
  }
}
