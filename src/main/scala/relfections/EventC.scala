package relfections

import java.sql.Timestamp

/**
  * @author Evgeny Borisov
  */
case class EventC(unitId: Int,eventType: String,timeStamp: Timestamp,value: Int,cValue:String) extends Event {

}
