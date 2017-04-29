/**
  * Model.scala
  */

package bloom.model

import bloom.globals._
import scala.collection.mutable.ArrayBuffer

object Model {

  var categories: Categories = ArrayBuffer[Category]()

  def addCategory(name: String): Unit = categories += new Category(uuid, name)

  def getCategoryByID(id: Int): Category = categories(id)

  def getCategories(): Categories = categories

}
