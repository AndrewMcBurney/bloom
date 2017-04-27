/**
  * Model.scala
  */

package bloom.model

object Model {

  var todos: Array[Todo] = Array[Todo]()

  // Adds todo to todoList
  def addTodo(text: String): Unit = todos = todos :+ new Todo(text, 1, 1)

}
