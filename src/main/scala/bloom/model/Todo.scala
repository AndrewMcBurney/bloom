/**
  * Todo.scala
  */

package bloom.model

class Todo(id: Int, var text: String, var priority: Int) {

  // Returns UUID hash code
  def getId(): Int = id

  // Edit todo text
  def changeText(newText: String) = text = newText

  // Change the priority of the todo item
  def changePriority(newPriority: Int) = priority = newPriority

  // Return HTML representation
  def toHTML(): String = s"<p id='$id'>$text</p>"

}
