/**
  * View.scala
  *
  * @version: 1.0
  * @author:  Andrew McBurney <andrewrobertmcburney@gmail.com>
  * @note:    Chrome extension made with SaclaJS
  *
  */

package bloom

import org.scalajs.dom
import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp

object Main extends JSApp {

  // Abstract this away to a model class
  var todos: Array[Todo] = Array[Todo]()

  /**
    * Updates view todoList with data from chrome storage
    */
  def updateTodoList(): Unit =
    for (todo <- todos) jQuery("#todos").append(todo.returnHTML)

  /**
    * Set up event listeners, etc.
    */
  def main(): Unit = {
    todos = todos :+ new Todo("test one", 1, 1)
    todos = todos :+ new Todo("test two", 1, 1)
    todos = todos :+ new Todo("test three", 1, 1)

    jQuery(() => updateTodoList())

    // set up listeners here
  }

}
