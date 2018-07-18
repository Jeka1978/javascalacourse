package com.naya.borisov

import java.time.LocalDateTime

package object method_implicit {

  case class EventA(
                     index: Int,
                     name: String,
                     timestamp: LocalDateTime,
                     field1: Option[String],
                     field2: Option[Double]
                   ) extends Event with Field1 with Field2

  case class EventB(
                     index: Int,
                     name: String,
                     timestamp: LocalDateTime,
                     field2: Option[Double],
                     field3: Option[Long],
                     field4: Option[BigInt]
                   ) extends Event with Field2 with Field3 with Field4

  trait Field1 {
    def field1: Option[String]
  }

  trait Field2 {
    def field2: Option[Double]
  }

  trait Field3 {
    def field3: Option[Long]
  }

  trait Field4 {
    def field4: Option[BigInt]
  }
}
