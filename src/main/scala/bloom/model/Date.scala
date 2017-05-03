/**
  * Data.scala
  */

package bloom.model

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

object Date {

  // Returns formatted minutes string
  def formatMinutes(): String = "%02d".format(_Date.minutes)

  // Returns formatted hour string for standard time
  def formatHours(): String = "%02d".format(_Date.hours - 12)

  // Returns formatted period string for standard time
  def formatPeriod(): String = if (_Date.hours >= 12) "PM" else "AM"

  // Returns string representation of date in military time
  def getMilitaryTime(): String = s"${_Date.hours}:$formatMinutes"

  // Returns string representation of date in standard time
  def getStandardTime(): String = s"$formatHours:$formatMinutes $formatPeriod"

}

@js.native
@JSGlobal("time")
object _Date extends js.Object {
  val hours: Int = js.native
  val minutes: Int = js.native
}
