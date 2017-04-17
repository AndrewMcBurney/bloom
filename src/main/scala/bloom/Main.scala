package bloom

import org.scalajs.dom
import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp

object Main extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    jQuery("h1").html("test this out from scala JS")
  }
}
