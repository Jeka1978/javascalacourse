package adapter

/**
  * @author Evgeny Borisov
  */
object CostableListExtensionsRegistry{
  implicit def wrapWithCostableList(list: List[Costable]):CostableList={
    new CostableList(list)
  }
}
