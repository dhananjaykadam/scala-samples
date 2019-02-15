import data.AliceData

import scala.collection.immutable.ListMap

var bookTestWordList = AliceData.bookText.split(AliceData.bookRegex).toList
var stopWordList = AliceData.stopWordText.split(AliceData.stopWordRegex)

var filteredWords = bookTestWordList.filterNot(stopWordList.contains)

var mapOfWords = filteredWords
  .groupBy(i => i)
  .mapValues(_.size).toMap

ListMap(mapOfWords.toSeq.sortWith(_._2 > _._2): _*)