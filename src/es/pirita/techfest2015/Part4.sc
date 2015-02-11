def add[T](list: List[T])(element: T): List[T] = element :: list

def count(list: List[_]): Int = list.size //Wildcard


trait Persona

case class Futbolista(dinero: Long) extends Persona
case class Profesor(publicaciones: Int) extends Persona

def add2[T <: Persona](list: List[T])(element: T): List[T] = element :: list //Bound Superclass
def add2[T >: Persona](list: List[T])(element: T): List[T] = element :: list //Bound Subclass
def add2[T : Persona](list: List[T])(element: T): List[T] = element :: list //Bound Same class


//////////////
//////////////
//////////////

//Covariant
class Covariant[+A]
val cv1: Covariant[AnyRef] = new Covariant[String]
//val cv2: Covariant[String] = new Covariant[AnyRef] Error

//Contravariant
class ContraVariant[-A]
//val contra1: ContraVariant[AnyRef] = new ContraVariant[String] Error
val contra2: ContraVariant[String] = new ContraVariant[AnyRef]

//Invariant, Not related
class Invariant[A]
//val inva1: Invariant[AnyRef] = new Invariant[String] Error
//val inva2: Invariant[String] = new Invariant[AnyRef] Error

//////////////
//////////////
//////////////

//View
implicit def strToInt(x: String): Int = x.toInt
val y: Int = "123"

