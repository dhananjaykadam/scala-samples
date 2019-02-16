
{

}

sealed abstract class Day(val name: String)
object Day {
  object Weekday extends Day("haha")
  object Weekend extends Day("nono")
}


Day.Weekday.name
Day.Weekend.name


