/**
  * Model.scala
  */

package bloom.model

import bloom.View
import bloom.ClockMode
import bloom.globals._
import scala.collection.mutable.ArrayBuffer

object Model {

  // Clock mode representation
  val clockMode: ClockMode.Value = ClockMode.Standard

  // ArrayBuffer list of user categories
  var categories: Categories = ArrayBuffer[Category]()

  // Keeps track of the open modal
  var openModalId: String = "null"

  // Return category by UUID
  def getCategoryByID(id: Int): Category = categories(id)

  // Return list of all categories as HTML
  def toHTML(): String = categories.map(_.toHTML).mkString("")

  // Callback function used for JavaScript chrome API
  def callback(results: String): Unit = {}

  // Storage location
  def getLocation(): Unit = Storage.location(callback _)

  // Update time based on clockMode value (military or standard)
  def updateTime(): Unit =
    if (clockMode == ClockMode.Military) View.updateTime(Date.getMilitaryTime)
    else View.updateTime(Date.getStandardTime)

  // Adds a category with given name
  def addCategory(name: String): Unit = {
    categories += new Category(uuid, name)
    View.updateTodoList()
  }

  // Sets the id of the current modal displayed - null if none
  def setCurrentOpenModal(id: String): Unit = {
    // Hide current modal if it's displayed
    View.hide(s"section.$openModalId")

    // Don't display the modal if the id hasn't changed (ie. toggle it)
    if (openModalId != id) {
      openModalId = id
      View.display(s"section.$openModalId")
    } else
      openModalId = "null"
  }

}
