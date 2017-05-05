/**
  * Model.scala
  */

package bloom.model

import bloom.View
import bloom.ClockMode
import bloom.globals._
import scala.collection.mutable.ArrayBuffer

object Model {

  /**
    * Object members
    */

  // Clock mode representation
  val clock: ClockMode.Value = ClockMode.Standard

  // Internal representation of minutes - if this changes, update view
  var min: Int = -1

  // ArrayBuffer list of user categories
  var categories: Categories = ArrayBuffer[Category]()

  // Keeps track of the open modal
  var openModalId: String = "null"

  /**
    * Object functions
    */

  // Return category by UUID
  def getCategoryByID(id: Int): Category = categories(id)

  // Return list of all categories as HTML
  def toHTML(): String = categories.map(_.toHTML).mkString("")

  // Callback function used for JavaScript chrome API
  def callback(results: String): Unit = {}

  // Storage location
  def getLocation(): Unit = Storage.location(callback _)

  // Update time based on clockMode value (military or standard)
  def updateTime(m: Int, h: Int): Unit =
    if (m != min) {
      min = m

      // Update the view time
      if (clock == ClockMode.Military)
        View.updateTime(Date.getMilitaryTime(m, h))
      else
        View.updateTime(Date.getStandardTime(m, h))
    }

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
