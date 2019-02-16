
val seq = Seq(1, 2, 3, 4)
val set = Set(1, 3, 3, 4)
val map = Map(1 -> "a", 2 -> "b")



seq.toSet

set(3)
set(30)

map(1)
map(2)
//map(20)

set.map(x => x * x)
map.map((t: (Int, String)) => t._1)
map.mapValues(x => x.length()).toMap
