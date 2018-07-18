package relfections

import java.sql.Timestamp

/**
  * @author Evgeny Borisov
  */
case class EventB(unitId: Int,eventType: String,timeStamp: Timestamp,value: Int,bValue:String) extends Event {

}
