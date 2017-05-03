/**
  * Controller.scala
  */

package bloom

import bloom.model.Model

import org.scalajs.dom.html
import scala.scalajs.js.timers._
import org.scalajs.dom.ext.KeyCode
import org.scalajs.dom.KeyboardEvent
import scala.scalajs.js.annotation.JSExportTopLevel

object Controller {

  // Updates the time
  def time(): Unit = {
    Model.updateTime()

    // Update every second
    setInterval(1000) {
      Model.updateTime()
    }
  }

  // Add Category with name
  @JSExportTopLevel("addCategory")
  def addCategory(in: html.Input): Unit = {
    in.onkeydown = { (e: KeyboardEvent) =>
      // Add a category to model if the keyCode is Enter
      if (e.keyCode == KeyCode.Enter) Model.addCategory(in.value)
    }
  }

  // TODO
  // Adds Todo for a given category
  @JSExportTopLevel("addTodo")
  def addTodo(in: html.Input): Unit = {
    in.onkeydown = { (e: KeyboardEvent) =>
      if (e.keyCode == KeyCode.Enter) Model.getCategoryByID(0).addTodo("one")
    }
  }

  // Adds Todo for a given category
  @JSExportTopLevel("displayModal")
  def displayModal(id: String): Unit = Model.setCurrentOpenModal(id)

}
