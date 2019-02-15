sealed trait CUSTOMER_TYPES

object CUSTOMER_TYPE {

  object REGULAR extends CUSTOMER_TYPES

  object REWARD extends CUSTOMER_TYPES

}

sealed trait DAYS

object DAY {

  object WEEKDAY extends DAYS

  object WEEKEND extends DAYS

}

case class Customer(
                     name: String,
                     customerType: CUSTOMER_TYPES
                   )

case class Hotel(
                  name: String,
                  rating: Int,
                  regularRateWeekDay: Int,
                  regularRateWeekEnd: Int,
                  rewardRateWeekDay: Int,
                  rewardRateWeekEnd: Int
                )

val Lakewood = Hotel("Lakewood", 3, 110, 80, 90, 80)
val Bridgewood = Hotel("Bridgewood", 4, 160, 110, 60, 50)
val Ridgewood = Hotel("Ridgewood", 5, 220, 100, 150, 40)

val hotelsList = List(Lakewood, Bridgewood, Ridgewood)

def findPriceByCustTypeAndDay(hotel: Hotel, customerType: CUSTOMER_TYPES, day: DAYS): Int = {
  if (day == DAY.WEEKDAY) {
    if (customerType == CUSTOMER_TYPE.REGULAR) {
      return hotel.regularRateWeekDay
    }
    return hotel.rewardRateWeekDay
  }
  if (customerType == CUSTOMER_TYPE.REGULAR) {
    return hotel.rewardRateWeekEnd
  }
  return hotel.rewardRateWeekEnd
}

def findCheapestCustomer(customerType: CUSTOMER_TYPES, day: DAYS): Hotel = {
  hotelsList
    .sortWith((a, b) => findPriceByCustTypeAndDay(a, customerType, day) < findPriceByCustTypeAndDay(b, customerType, day))
    .head
}

findCheapestCustomer(CUSTOMER_TYPE.REGULAR, DAY.WEEKDAY)