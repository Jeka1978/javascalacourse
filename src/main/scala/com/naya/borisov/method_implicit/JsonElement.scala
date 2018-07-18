package com.naya.borisov.method_implicit

import java.time.LocalDateTime

/**
  * @author Evgeny Borisov
  */
case class JsonElement(
                        variant: String,
                        index: Int,
                        name: String,
                        timestamp: LocalDateTime
                      ) extends Event {
  def toEvent: Event = variant match {
    case "A" => EventA(index, name, timestamp, None, None)
    case "B" => EventB(index, name, timestamp, None, None, None)
  }
}
