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

import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp

object View extends JSApp {

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
