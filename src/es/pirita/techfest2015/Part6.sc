
///////
//Classes
///////

//If you don't put the type of variable (val/var) it will be a private val
//Initialization is done in the class body
class PersonOld(age: Int, private var _money: Int, var  name: String, val surname: String) {
  val drive =  age >= 18

  def aux = 5
  def money = _money
  def money_=(newMonry : Int) = _money = newMonry

  //Everything is public by default
  def printName(): Unit = print(s"Name is $name")
  def sumAge(n: Int): Int = n + age
}


////

val personOld = new PersonOld(15, 12, "Pepe", "Apellido")
personOld.name
personOld.money = 4

class Person(age: Int, var  name: String, val surname: String) {
  val drive =  age >= 18

  //Everything is public by default
  def printName(): Unit = print(s"Name is $name")
  def sumAge(n: Int): Int = n + age
}

val person = new Person(12, "Pepe", "Apellido")
person.name

person printName()

person sumAge 10

//We can delay the creation of a person
//Concern separation
val person2: String => Person = new Person(12, _, "Apellido")
val person3: (String, String) => Person = new Person(12, _, _)

person2("jose")

/////////
//Objects
/////////
//Creates a type and a singleton instance
object Unique{
  val aux = 2
}

Unique.aux

////////////
//Companion Objects
////////////

class Cube(size: Int){

  def area : Int = ???
}

object Cube{
  def apply(size: Int) = new Cube(size)
  def apply(size: Int, scale: Int) = new Cube(size*scale)
}

Cube(1)
Cube(1, 4)

///////
//Case classes
///////

//Usually as a holders of immutable data but they are classes
//They have serialize, field equality, extraction!!!....

case class Rectangle(a: Double, b : Double)

val rec1 = Rectangle(1, 5)
val rec2 = Rectangle(1, 7)
rec1.a

rec1 == rec2

//Easy to copy
val otherRectangle = rec1.copy(b = 7)




