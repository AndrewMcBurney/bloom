/**
  * Todo.scala
  */

package bloom

class Todo(var text: String, var priority: Int, date: Int) {

  // Edit todo text
  def changeText(newText: String) = text = newText

  // Change the priority of the todo item
  def changePriority(newPriority: Int) = priority = newPriority

  // Return HTML representation
  def returnHTML(): String = s"<p>$text</p>"

}
