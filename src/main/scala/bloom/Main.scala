/**
  * Main.scala
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
  var todos: Array[Todo] = Array[Todo]()

  /**
    * Updates view todoList with data from chrome storage
    */
  def updateTodoList(): Unit = {
    jQuery("body").append("<p>Hello World test this out.</p>")
    jQuery("#test").html("Bloom")
  }

  /**
    * Set up event listeners, etc.
    */
  def main(): Unit = {
    println("Hello world test!")

    jQuery(() => updateTodoList())
  }

}
