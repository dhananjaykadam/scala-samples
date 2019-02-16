sealed trait Day
object Day {
  object Weekday extends Day
  object Weekend extends Day
}

sealed trait CustomerType
object CustomerType {
  object Reward extends CustomerType
  object Regular extends CustomerType
}

case class Categoty(customer: CustomerType, day: Day)

case class SearchRequest(customer: CustomerType, days: List[Day]) {
  def categories: List[Categoty] = days.map(d => Categoty(customer, d))
}

case class Hotel(name: String, rating: Int, rates: Map[Categoty, Int]) {
  def priceFor(searchRequest: SearchRequest): Int =
    searchRequest.categories.map(c => rates(c)).sum
}

class BookingService(hotels: List[Hotel]) {
  def findCheapestHotel(searchRequest: SearchRequest): Hotel =
    hotels.minBy(h => (h.priceFor(searchRequest), -h.rating))
}
