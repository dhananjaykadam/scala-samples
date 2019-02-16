
case class Person(name: String, age: Int)

//def m(person: Person) = person match {
//  case Person(name, age) => s"hello mr $name with age=$age"
//}

val person = Person("ajit", 29)
val Person(_, ag) = person

ag
