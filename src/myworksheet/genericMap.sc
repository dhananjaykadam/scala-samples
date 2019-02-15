def map[T,B](list: List[T], f: T => B): List[B] = {
  var result = List.empty[B]
  val listIterator = list.iterator
  while (listIterator.hasNext) {
    result = f(listIterator.next()) :: result
  }
  result.reverse
}

var list = map(List(1, 2, 3), (f:Int) => f * 1)
list