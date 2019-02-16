

def map(list: List[Int], f: Int => Int): List[Int] = {
  var result = List.empty[Int]
  val iterator = list.iterator
  while (iterator.hasNext) {
    result = f(iterator.next()) :: result
  }
  result.reverse
}

val xs: List[Int] = List(1, 2, 3)

val f: Int => Int = x => x * x

val f2: Int => Int = new (Int => Int) {
  override def apply(x: Int) = x * x
}

val f3: Function[Int, Int] = new Function[Int, Int] {
  override def apply(x: Int) = x * x
}

map(xs, f)
map(xs, f2)
