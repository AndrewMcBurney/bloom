/**
  * Model.scala
  */

package bloom.model

object Model {

  var categories: Array[Category] = Array[Category]()

  def addCategory(text: String): Unit =
    categories = categories :+ new Category(Array[Todo](), text, 0)

  def getCategoryByID(id: Int): Category = categories(0)

  def getCategories(): Array[Category] = categories

}
