package relfections

import java.sql.Timestamp

/**
  * @author Evgeny Borisov
  */
case class EventD(unitId: Int,eventType: String,timeStamp: Timestamp,value: Int,dValue:String) extends Event {

}
