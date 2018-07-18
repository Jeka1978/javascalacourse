package com.army.course.adapter

import com.army.course.adapter
import heroes.Troll

/**
  * @author Evgeny Borisov
  */
object ProductFactory extends App {
  /*def generateProduct(): Item = {
    val list: List[adapter.Item.Value] = Item.values.toList
  }*/

  def generate(): Any = {
    Seq(() => new Troll).head
  }

}
