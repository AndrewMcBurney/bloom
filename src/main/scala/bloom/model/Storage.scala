/**
  * Storage.scala
  * JavaScript facade for storage object
  */

package bloom.model

import bloom.View
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

object Storage {

  // Returns string representation of categories
  def categories(callback: String => Unit): Unit =
    _Storage.categories((location: String) => View.updateLocation(location))

  // Returns string representation of current location
  def location(callback: String => Unit): Unit =
    _Storage.location((location: String) => View.updateLocation(location))

}

@js.native
@JSGlobal("storage")
object _Storage extends js.Object {
  def categories(callback: js.Function1[String, _]): Unit = js.native
  def location(callback: js.Function1[String, _]): Unit = js.native
}
