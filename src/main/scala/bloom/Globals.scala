/**
  * Globals.scala
  *
  * @note:    Global package variables and functions
  */

package bloom

import bloom.model.Todo
import bloom.model.Category
import scala.collection.mutable.ArrayBuffer

package object globals {

  // Typedefs
  final type Todos = ArrayBuffer[Todo]
  final type Categories = ArrayBuffer[Category]

  // UUID
  def uuid = java.util.UUID.randomUUID.hashCode

}

// Clock Mode object representation
object ClockMode extends Enumeration {
  val Military, Standard = Value
}
