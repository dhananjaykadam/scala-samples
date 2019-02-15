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

case class Customer(name: String, customerType: CUSTOMER_TYPES)

case class Hotel(
                  name: String,
                  rating: Int,
                  regularRateWeekDay: Int,
                  rewardRateWeekDay: Int,
                  regularRateWeekEnd: Int,
                  rewardRateWeekEnd: Int
                )

val Lakewood = Hotel("Lakewood", 3, 110, 80, 90, 80)
val Bridgewood = Hotel("Bridgewood", 4, 160, 110, 60, 50)
val Ridgewood = Hotel("Ridgewood", 5, 220, 100, 150, 40)

val hotelsList = List(Lakewood, Bridgewood, Ridgewood)

def getHotelPrice(hotel: Hotel, customerType: CUSTOMER_TYPES, day: DAYS): Int = {
  if (day == DAY.WEEKDAY) {
    if (customerType == CUSTOMER_TYPE.REGULAR) {
      return hotel.regularRateWeekDay
    }
    return hotel.rewardRateWeekDay
  }
  if (customerType == CUSTOMER_TYPE.REGULAR) {
    return hotel.regularRateWeekEnd
  }
  hotel.rewardRateWeekEnd
}

def findCheapestHotel(customerType: CUSTOMER_TYPES, day: DAYS): Hotel = {
  hotelsList
    .map(hotel => (getHotelPrice(hotel, customerType, day), hotel))
    .sortWith((a, b) => (a._1 < b._1) || (a._1 == b._1 && a._2.rating > b._2.rating))
    .head._2
}

findCheapestHotel(CUSTOMER_TYPE.REGULAR, DAY.WEEKDAY)
findCheapestHotel(CUSTOMER_TYPE.REWARD, DAY.WEEKDAY)

findCheapestHotel(CUSTOMER_TYPE.REGULAR, DAY.WEEKEND)
findCheapestHotel(CUSTOMER_TYPE.REWARD, DAY.WEEKEND)