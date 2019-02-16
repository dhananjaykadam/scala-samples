
def foldLeft1[A, B](xs: List[A], seed: B)(f: (B, A) => B): B = {
  var result = seed
  val iterator = xs.iterator
  while (iterator.hasNext) {
    result = f(result, iterator.next())
  }
  result
}

def foldLeft[A, B](xs: List[A], seed: B)(f: (B, A) => B): B = {
  if(xs.isEmpty) {
    seed
  } else {
    foldLeft(xs.tail, f(seed, xs.head))(f)
  }
}

val xs = List(1, 2, 3, 4)
foldLeft(xs, "")((acc, elm) => acc + elm)
