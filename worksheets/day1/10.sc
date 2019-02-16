import data.AliceData

AliceData.bookRegex
AliceData.stopWordRegex
AliceData.stopWordText

val words = AliceData.bookText.split(AliceData.bookRegex)

val stopWords = AliceData.stopWordText.split(AliceData.stopWordRegex).toSet

val realWords = words.filterNot(w => stopWords.contains(w))

realWords
  .foldLeft(Map.empty[String, Int]) { (map, elm) =>
    val currentValue = map.getOrElse(elm, 0)
    map.updated(elm, currentValue + 1)
  }
  .toList
//  .sortWith((a, b) => a._2 > b._2)
  .sortBy(t => -t._2)
  .take(10)
  .foreach(println)

realWords
  .groupBy(identity)
  .view
  .mapValues(xs => xs.length)
  .toList
  .sortBy(t => -t._2)
  .view
  .take(10)
  .foreach(println)
