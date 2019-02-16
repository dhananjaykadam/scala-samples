
trait Transform {
  def invoke(x: Int): Int
}

val f: Int => Int = x => x * x
def map(list: List[Int], f: Int => Int): List[Int] = {
  var result = List.empty[Int]
  val iterator = list.iterator
  while (iterator.hasNext) {
    result = f(iterator.next()) :: result
  }
  result.reverse
}

map(List(1, 2, 3), f)
map(List(1, 2, 3), (x: Int) => x * x)
