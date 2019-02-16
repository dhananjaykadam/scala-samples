package code

object Main extends App {
  println(Sorter.sort(List(9, 4, 1, 8, 5, 6))(Ord.intOrd))

  println(Sorter.sort(List("zsd", "sdf", "wer", "oiu", "asd", "ert"))(Ord.stringOrd))
}
