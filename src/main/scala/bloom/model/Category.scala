/**
  * Category.scala
  */

package bloom.model

import bloom.globals.uuid

class Category(id: Int, name: String, var todos: Array[Todo] = Array[Todo]()) {

  // Add Todo for category
  def addTodo(text: String): Unit = todos = todos :+ new Todo(uuid, text, 1)

  // Return HTML representation of category's todos
  def toHTML(): String = s"<h3 id='$id'>$name</h3>" + todos.map(_.toHTML).mkString("")

}
