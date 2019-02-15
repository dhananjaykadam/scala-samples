def map(list: List[Int], f: Int => Int): List[Int] = {
  var result = List.empty[Int]
  val listIterator = list.iterator
  while (listIterator.hasNext) {
    result = f(listIterator.next()) :: result
  }
  result.reverse
}

var list = map(List(1, 2, 3), f => f * 1)
list