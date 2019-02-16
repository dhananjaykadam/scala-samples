
val xs = (1 to 1000).toList

xs.map { x =>
      println(s"inside map $x")
      x + 1
    }
    .filter { x =>
      println(s"inside filter $x")
      x > 1
    }.take(1)
  .toList