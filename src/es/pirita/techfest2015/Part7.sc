/////
///Traits
/////

//Traits are like interfaces but better
trait Fly{
  val height: Int  // Val does not to be initialize
  def speed(sum: Int): Int
}

//But you can define everything
trait Meow{
  val times: Int = 5
  def meow() = println("Meoow")
}

//But you can define everything
trait Woof{
  def woof() = println("Woof")
}

class Animal(name: String)
class AnimalMeow(name: String) extends Meow //You can extends a trait

val animalNormal = new Animal("Pig")
val animalMeow = new AnimalMeow("Pig2")
val animalSuperMeow = new Animal("Pig3") with Meow //Mixin!!
animalNormal //No meow
animalMeow.meow()
animalSuperMeow.meow()

//Obviously you can have multiples traits
val animalSuperMeowWoof = new Animal("Pig3") with Meow with Woof //Mixin!!
animalSuperMeowWoof.meow()
animalSuperMeowWoof.woof()

//You can use traits as Types
def onlyCats(cat: Animal with Meow) = ???

////
//Diamond Problem???  -- Linearization !!!
////
trait Talk{
  def hello = ""
}
trait TalkSpanish extends Talk{
  override def hello = "Hola"
  def two = "2"
}
trait TalkEnglish extends Talk{
  override def hello = "Hello"
  def jump = "jump"
}
case class Human(name: String) extends TalkEnglish with TalkSpanish

val human = Human("Nombre")
human.hello //Hola
human.jump
human.two


