/**
  * View.scala
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

  val tempImg: String = "src/main/resources/images/bg.jpg"

  // Updates view todoList with data from chrome storage
  def updateTodoList(): Unit = jQuery("#todo-list").html(Model.toHTML())

  // Updates displayed location
  def updateLocation(loc: String): Unit = jQuery("#location").html(loc)

  // Updates background image
  def updateImage(): Unit = jQuery("body").css("background", "url(src/main/resources/images/bg.jpg) center center / cover no-repeat;")

  // Updates displayed time
  def updateTime(time: String): Unit = jQuery("#time").html(time)

  // Display element with given id
  def hide(id: String): Unit = jQuery(id).css("display", "none")

  // Display element with given id
  def display(id: String): Unit = jQuery(id).css("display", "block")

  // Initial UI setup
  def setUpUI(): Unit = {
    //updateImage()
    Model.getLocation()
    updateTodoList()
    jQuery("body").css("display", "block")
    Controller.time()
  }

  // Set up event listeners, etc.
  def main(): Unit = jQuery(() => setUpUI())

}
