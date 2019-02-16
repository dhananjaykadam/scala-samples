
case class Person(name: String = "abc", age: Int = 10)

object A {
  val PI = 3.14
  def square(x: Int): Int = x * x

  def makePerson(string: String) = {
    //parse the streing
    new Person()
  }
}

A.PI
A.square(10)
A.makePerson("asasd")
