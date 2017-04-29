/**
  * Category.scala
  */

package bloom.model

import bloom.Main
import bloom.globals._
import scala.collection.mutable.ArrayBuffer

class Category(id: Int, name: String, var todos: Todos = ArrayBuffer[Todo]()) {

  // Add Todo for category
  def addTodo(text: String): Unit = todos += new Todo(uuid, text, 1)

  // Removes todo for category given UUID hash code
  def removeTodo(uuid: Int): Unit = todos = todos.filter(_.getId != uuid)

  // Return HTML representation of category's todos
  def toHTML(): String = s"<h3 id='$id'>$name</h3>" + todos.map(_.toHTML).mkString("")

}
