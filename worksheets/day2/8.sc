
class Person(val name: String, val age: Int)

object Person {
  def apply(name: String, age: Int): Person =
    new Person(name, age)
  def unapply(person: Person): Option[(String, Int)] =
    Some((person.name, person.age))
}

val person = Person("ajit", 29)

val Person(mn, ag) = person

