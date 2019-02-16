
sealed trait CL[T]
case class NonEmptyList[T](head: T, tail: CL[T]) extends CL[T]
case class EmptyList[T]() extends CL[T]

def length[A](list: List[A]): Int = list match {
  case Nil => 0
  case ::(head, tail)    => 1 + length(tail)
}

length(List(1, 2, 3, 4))

