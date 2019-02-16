

sealed trait Tree[T]
case class Node[T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T]
case class Leaf[T](value: T) extends Tree[T]
case class Empty[T]() extends Tree[T]
