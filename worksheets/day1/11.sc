
import data.Data._

books.foreach(println)

books.groupBy(_.author).foreach(println)

books.sortBy(_.author).foreach(println)

books.sortBy(b => (b.author, b.basePrice)).foreach(println)