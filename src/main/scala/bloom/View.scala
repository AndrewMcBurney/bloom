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
import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp

object Main extends JSApp {

  // Updates view todoList with data from chrome storage
  def updateTodoList(): Unit =
    for (category <- Model.getCategories())
      jQuery("#todos").append(category.toHTML)

  // Set up event listeners, etc.
  def main(): Unit = {
    Model.addCategory("category_name")
    Model.getCategoryByID(0).addTodo("one")
    Model.getCategoryByID(0).addTodo("two")
    Model.getCategoryByID(0).addTodo("three")

    jQuery(() => updateTodoList())

    // set up listeners here
  }

}
