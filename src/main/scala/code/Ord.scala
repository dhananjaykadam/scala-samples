package code

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {
  val intOrd: Ord[Int] = new Ord[Int] {
    override def lt(a: Int, b: Int): Boolean = a < b
  }

  val stringOrd: Ord[String] = new Ord[String] {
    override def lt(a: String, b: String): Boolean = a < b
  }
}
