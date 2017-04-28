/**
  * Category.scala
  */

package bloom.model

class Category(var todos: Array[Todo], name: String, id: Int) {

  // Add Todo for category
  def addTodo(text: String): Unit = todos = todos :+ new Todo(text, 1, 1)

  // Return HTML representation of category's todos
  def toHTML(): String = s"<h3>$name</h3>" + todos.map(_.toHTML).mkString("")

}
