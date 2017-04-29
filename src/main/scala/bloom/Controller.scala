/**
  * Controller.scala
  */

package bloom

import bloom.model.Model

import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp
import org.scalajs.dom.ext.KeyCode
import org.scalajs.dom.KeyboardEvent
import scala.scalajs.js.annotation.JSExportTopLevel

object Controller {

  // Add Category with name
  @JSExportTopLevel("addCategory")
  def addCategory(in: html.Input): Unit = {
    in.onkeydown = { (e: KeyboardEvent) =>
      // Add a category if the keyCode is Enter
      if (e.keyCode == KeyCode.Enter) {
        // Add Category in model
        Model.addCategory(in.value)
        println("add category")
      }
    }
  }

  // Adds Todo for a given category
  @JSExportTopLevel("addTodo")
  def addTodo(in: html.Input): Unit = {
    in.onkeydown = { (e: KeyboardEvent) =>
      if (e.keyCode == KeyCode.Enter) {
        Model.getCategoryByID(0).addTodo("one")
        println("add todo")
      }
    }
  }

}
