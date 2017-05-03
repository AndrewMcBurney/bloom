/**
  * Controller.scala
  */

package bloom

import bloom.model.Model
import scala.scalajs.js.annotation._

@JSExportTopLevel("Controller")
object Controller {

  // Updates the time every second
  @JSExport
  def time(m: Int, h: Int): Unit = Model.updateTime(m, h)

  // Add Category with name
  @JSExport
  def addCategory(categoryName: String): Unit = Model.addCategory(categoryName)

  // Adds Todo for a given category
  @JSExport
  def displayModal(id: String): Unit = Model.setCurrentOpenModal(id)

}
