val t: (Int, String, Float) = (1, "abc", 5.6f)

t._1
t._2
t._3

trait Function1[A, B] {
  def apply(x: A): B
}

trait Function2[A, B, C] {
  def apply(x: A, y: B): C
}


