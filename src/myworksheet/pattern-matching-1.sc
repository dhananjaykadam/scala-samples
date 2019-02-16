
sealed trait CL[T]
case class NotEmptyList[T](head: T, tail: CL[T]) extends CL[T]
case class EmptyList[T]() extends CL[T]


sealed trait Tree[T]
case class Node[T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T]
case class Leaf[T](value: T) extends Tree[T]
case class Empty[T]() extends Tree[T]

sealed trait JSON
case class Object(value: Map[String, JSON]) extends JSON
case class JsonString (value: String) extends JSON
case class JsonArray(value: List[JSON]) extends JSON
case class JsonNumber(value: Double) extends JSON

abstract class JsonBoolean(val value: Boolean) extends JSON
case object JsonTrue extends JsonBoolean(true)
case object JsonFalse extends JsonBoolean(false)

case object JsonNull extends JSON



