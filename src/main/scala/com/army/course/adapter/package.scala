package com.army.course

import com.army.course.adapter.Item.LocalValue

/**
  * @author Evgeny Borisov
  */

package object adapter {

  trait Thing {
    def price: Int
  }

  case class Chair(price: Int) extends Thing

  case class Table(price: Int) extends Thing

  case class Car(price: Int) extends Thing

  case class House(price: Int) extends Thing

  type Item = Item.LocalValue

  object Item extends Enumeration {

    val Chair = LocalValue(100)
    val Table = LocalValue(200)
    val Car = LocalValue(200)
    val House = LocalValue(200)

    case class LocalValue(price: Int) extends Val with Thing {
      override def toString(): String = super.toString() + " - $" + price
    }
  }

}
