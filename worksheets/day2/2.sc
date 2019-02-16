{}

sealed trait Optional[T]
case class Defined[T](value: T) extends Optional[T]
case class Undefined[T]() extends Optional[T]

case class Hotel(name: String, rating: Optional[Int])

new Hotel("abc", new Defined(10))
new Hotel("abc", new Undefined[Int]())

def avgRating(hotels: List[Hotel]): Int = {
//    def rating(optionalRating: Optional[Int]): Int = {
//      if (optionalRating.isInstanceOf[Defined[Int]]) {
//        optionalRating.asInstanceOf[Defined[Int]].value
//      } else if (optionalRating.isInstanceOf[Undefined[Int]]) {
//        0
//      } else {
//        0
//      }
//    }
    def rating2(optionalRating: Optional[Int]): Int = optionalRating match {
      case Defined(value) => value
      case Undefined()    => 0
    }
    hotels.map(hotel => rating2(hotel.rating)).sum / hotels.length
  }

