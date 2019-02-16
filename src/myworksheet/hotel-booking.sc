sealed trait CUSTOMER_TYPES
sealed trait DAYS

object CUSTOMER_TYPE {
  object REGULAR extends CUSTOMER_TYPES
  object REWARD extends CUSTOMER_TYPES
}

object DAY {
  object WEEKDAY extends DAYS
  object WEEKEND extends DAYS
}

case class HotelPrice(price: Int, forCustType: CUSTOMER_TYPES, forDay: DAYS) {
}

case class Customer(name: String, customerType: CUSTOMER_TYPES)

case class Hotel(
                  name: String,
                  rating: Int,
                  prices: List[HotelPrice]
                )

val Lakewood = Hotel("Lakewood", 3, List(
  HotelPrice(110, CUSTOMER_TYPE.REGULAR, DAY.WEEKDAY),
  HotelPrice(80, CUSTOMER_TYPE.REWARD, DAY.WEEKDAY),
  HotelPrice(90, CUSTOMER_TYPE.REGULAR, DAY.WEEKEND),
  HotelPrice(90, CUSTOMER_TYPE.REWARD, DAY.WEEKEND)
))

val Bridgewood = Hotel("Bridgewood", 4, List(
  HotelPrice(160, CUSTOMER_TYPE.REGULAR, DAY.WEEKDAY),
  HotelPrice(110, CUSTOMER_TYPE.REWARD, DAY.WEEKDAY),
  HotelPrice(60, CUSTOMER_TYPE.REGULAR, DAY.WEEKEND),
  HotelPrice(50, CUSTOMER_TYPE.REWARD, DAY.WEEKEND)
))
val Ridgewood = Hotel("Ridgewood", 5, List(
  HotelPrice(220, CUSTOMER_TYPE.REGULAR, DAY.WEEKDAY),
  HotelPrice(100, CUSTOMER_TYPE.REWARD, DAY.WEEKDAY),
  HotelPrice(150, CUSTOMER_TYPE.REGULAR, DAY.WEEKEND),
  HotelPrice(40, CUSTOMER_TYPE.REWARD, DAY.WEEKEND)
))

val hotelsList = List(Lakewood, Bridgewood, Ridgewood)

def getHotelPrice(hotel: Hotel, customerType: CUSTOMER_TYPES, day: DAYS): Int = {
  hotel.prices.filter(p => p.forCustType == customerType && p.forDay == day).head.price
}

def findCheapHotel(customerType: CUSTOMER_TYPES, day: DAYS): String = {
  hotelsList
    .map(hotel => (getHotelPrice(hotel, customerType, day), hotel))
    .sortWith((a, b) => (a._1 < b._1) || (a._1 == b._1 && a._2.rating > b._2.rating))
    .head._2.name
}

findCheapHotel(CUSTOMER_TYPE.REGULAR, DAY.WEEKDAY)
findCheapHotel(CUSTOMER_TYPE.REWARD, DAY.WEEKDAY)

findCheapHotel(CUSTOMER_TYPE.REGULAR, DAY.WEEKEND)
findCheapHotel(CUSTOMER_TYPE.REWARD, DAY.WEEKEND)