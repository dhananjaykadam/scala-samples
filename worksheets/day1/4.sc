
def map[A, B](list: List[A], f: A => B): List[B] = {
  var acc = List.empty[B]
  val iterator = list.iterator
  while (iterator.hasNext) {
    acc = f(iterator.next()) :: acc
  }
  acc.reverse
}

map(List(1, 2, 3), (x: Int) => x * x)
