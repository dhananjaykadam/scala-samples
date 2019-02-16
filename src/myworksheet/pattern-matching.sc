
trait Optional[T] {
  def isPresent(): Boolean
}

case class Defined[T](value: T) extends Optional[T] {
  override def isPresent(): Boolean = true
}

case class UnDefined[T]() extends Optional[T] {
  override def isPresent: Boolean = false
}

case class Rating(rating: Int)

case class Hotel(name: String, rating: Optional[Int])

def getMeHotelList(): List[Hotel] = {
  List(
    Hotel("A", new Defined[Int](10)),
    Hotel("B", new Defined[Int](100)),
    Hotel("C", new UnDefined[Int]()),
    Hotel("D", new UnDefined[Int]()),
  )
}

def mapRatingToInt(rating: Optional[Int]): Int = {
  if (rating.isPresent()) {
    return rating.asInstanceOf[Defined[Int]].value
  }
  0
}

def patternMatch(rating: Optional[Int]): Int = rating match {
  case Defined(value) => value
  case UnDefined() => 0
}

def avgRating(hotels: List[Hotel]): Int = {
  hotels.map(h => patternMatch(h.rating)).sum
}


avgRating(getMeHotelList())


case class Person(name: String, age: Int)

val person = Person("A", 10)
val Person(name, age) = person


