/**
  * View.scala
  *
  * @version: 1.0
  * @author:  Andrew McBurney <andrewrobertmcburney@gmail.com>
  * @note:    Chrome extension made with SaclaJS
  *
  */

package bloom

// Bloom imports
import bloom.model.Todo
import bloom.model.Model

// External imports
import org.scalajs.dom
import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp

object Main extends JSApp {

  // Updates view todoList with data from chrome storage
  def updateTodoList(): Unit =
    for (todo <- Model.todos) jQuery("#todos").append(todo.returnHTML)

  // Set up event listeners, etc.
  def main(): Unit = {
    Model.addTodo("one")
    Model.addTodo("two")
    Model.addTodo("three")

    jQuery(() => updateTodoList())

    // set up listeners here
  }

}
