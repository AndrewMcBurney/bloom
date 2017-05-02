/**
  * Storage.scala
  */

package bloom.model

import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js

object Storage {
  type ChromeCallback = String => Unit

  def location(callback: ChromeCallback): Unit = {
    _Storage.location((results: js.UndefOr[String]) => {println(results)})
  }
}

@js.native
@JSGlobal("storage")
object _Storage extends js.Object {
  def location(callback: js.Function1[js.UndefOr[String], _]): Unit = js.native
}
