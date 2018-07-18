package relfections
import java.sql.Timestamp

/**
  * @author Evgeny Borisov
  */
case class EventA(val unitId: Int,val eventType: String,val value: Int,val aValue:String) extends Event {

}
