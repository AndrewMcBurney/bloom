/**
  * Model.scala
  */

package bloom.model

import bloom.globals.uuid
import scala.collection.mutable.ArrayBuffer

object Model {

  var categories: ArrayBuffer[Category] = ArrayBuffer[Category]()

  def addCategory(name: String): Unit = categories += new Category(uuid, name)

  def getCategoryByID(id: Int): Category = categories(id)

  def getCategories(): ArrayBuffer[Category] = categories

}
