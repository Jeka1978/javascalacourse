package solutions.adapter

import solutions.adapter

import scala.util.Random


/**
  * @author Evgeny Borisov
  */
object ItemFactory  {
  val itemList: List[adapter.Item.Value] = Item.values.toList
  def generate():Costable={
    itemList(Random.nextInt(itemList.size)).asInstanceOf[Costable]
  }

  def generate(amount:Int):List[Costable]={
    Range(0,amount).map(_=>generate()).toList
  }


}
