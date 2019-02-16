
case class Person(name: String = "abc", age: Int = 10) {
  def isAdult = age > 18
  val someProperty = age * 100
}

val person = new Person(
  name = "ajit",
  age = 29
)
val person2 = new Person(
  name = "ajit",
  age = 29
)

person.copy()
person.copy(age = 32)
person.copy(name = "wdasda")
person.copy(age= 78, name = "wdasda")


person == person2
person eq person2


person.hashCode()
person2.hashCode()

person.name
person.age
person.isAdult
person.someProperty


