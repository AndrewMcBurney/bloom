/**
  * View.scala - tightly coupled view and controller class
  *
  * @version: 1.0
  * @author:  Andrew McBurney <andrewrobertmcburney@gmail.com>
  * @note:    Chrome extension made with SaclaJS
  *
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

object Main extends JSApp {

  // Updates view todoList with data from chrome storage
  def updateTodoList(): Unit = jQuery("#todo-list").html(Model.toHTML)

  // Initial UI setup
  def setUpUI(): Unit = {
    jQuery("body").css("display", "block")
    updateTodoList()
  }

  // Set up event listeners, etc.
  def main(): Unit = jQuery(() => setUpUI())

}
