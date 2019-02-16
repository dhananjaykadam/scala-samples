case class Hotel(name: String, rating: Option[Int])

def rating2(optionalRating: Option[Int]): Int = optionalRating match {
  case Some(value) => value
  case None    => 0
}

val x: Option[Int] = Some(10)
val y: Option[Int] = None

val Some(a) = x