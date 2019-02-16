
def foldLeft[A, B](xs: List[A], seed: B)(f: (B, A) => B): B = {
  var result = seed
  val iterator = xs.iterator
  while (iterator.hasNext) {
    result = f(result, iterator.next())
  }
  result
}

val xs = List(1, 2, 3, 4)
foldLeft(xs, 0)((acc, elm) => acc + elm)
foldLeft(xs, 1)((acc, elm) => acc * elm)
foldLeft(xs, "")((acc, elm) => acc + elm)
foldLeft(xs, List.empty[Int])((acc, elm) => elm :: acc)

def reverse[A](xs: List[A]): List[A] =
  foldLeft(xs, List.empty[A])((acc, elm) => elm :: acc)

reverse(xs)

def map[A, B](list: List[A])(f: A => B): List[B] = {
  reverse(
    foldLeft(list, List.empty[B])(
      (acc, elm) => f(elm) :: acc
    )
  )
}

map(xs)(x => x * x)
