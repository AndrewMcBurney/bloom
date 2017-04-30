/**
  * Model.scala
  */

package bloom.model

import bloom.View
import bloom.globals._
import scala.collection.mutable.ArrayBuffer

object Model {

  // ArrayBuffer list of user categories
  var categories: Categories = ArrayBuffer[Category]()

  // Keeps track of the open modal
  var openModalId: String = "null"

  // Adds a category with given name
  def addCategory(name: String): Unit = {
    categories += new Category(uuid, name)
    View.updateTodoList()
  }

  // Return category by UUID
  def getCategoryByID(id: Int): Category = categories(id)

  // Return list of all categories as HTML
  def toHTML(): String = categories.map(_.toHTML).mkString("")

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
