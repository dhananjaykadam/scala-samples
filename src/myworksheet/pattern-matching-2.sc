val givenList = List(1, 5, 7, 13, 20)

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case Nil => List(x)
  case head :: _ if x < head => x :: xs
  case head :: tail => head :: insert(x, tail)
}

def sort(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case head:: tail => insert(head, sort(tail))
}
insert(12, givenList)

sort(List(5,4,7,2))



def insert[T](x: T, xs: List[T]): List[T] = xs match {
  case Nil => List(x)
  case head :: _ if x < head => x :: xs
  case head :: tail => head :: insert(x, tail)
}

def sort[T](xs: List[T]): List[T] = xs match {
  case Nil => Nil
  case head:: tail => insert(head, sort(tail))
}
