/**
  * Model.scala
  */

package bloom.model

import bloom.Main
import bloom.globals._
import scala.collection.mutable.ArrayBuffer

object Model {

  // ArrayBuffer list of user categories
  var categories: Categories = ArrayBuffer[Category]()

  // Adds a category with given name
  def addCategory(name: String): Unit = categories += new Category(uuid, name)

  // Return category by UUID
  def getCategoryByID(id: Int): Category = categories(id)

  // Return list of all categories as HTML
  def toHTML(): String = categories.map(_.toHTML).mkString("")

}
