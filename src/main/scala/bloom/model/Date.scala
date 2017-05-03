/**
  * Data.scala
  */

package bloom.model

object Date {

  // Returns formatted minutes string
  def formatMinutes(m: Int): String = "%02d".format(m)

  // Returns formatted hour string for standard time
  def formatHours(h: Int): String = "%02d".format(h % 12)

  // Returns formatted period string for standard time
  def formatPeriod(h: Int): String = if (h >= 12) "PM" else "AM"

  // Returns string representation of date in military time
  def getMilitaryTime(m: Int, h: Int): String = s"$h:${formatMinutes(m)}"

  // Returns string representation of date in standard time
  def getStandardTime(m: Int, h: Int): String =
    s"${formatHours(h)}:${formatMinutes(m)} ${formatPeriod(h)}"

}
