
var x = 10
x = 11

val xs = List(1, 2, 3, 4)
xs.iterator
0 :: xs
xs

xs.map(x => x * x)
xs.map(x => x + 1)

def map(list: List[Int], f: Int => Int): List[Int] = {
  var result = List.empty[Int]

//  f.apply()

  ???
}

map(xs, x => x * x)
