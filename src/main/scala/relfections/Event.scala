package relfections

import java.sql.Timestamp

/**
  * @author Evgeny Borisov
  */
trait Event {
  def unitId: Int

  def eventType: String

  def value: Int
}
