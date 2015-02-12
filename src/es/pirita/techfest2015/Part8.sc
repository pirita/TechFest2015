import java.io.FileNotFoundException

import scala.util.Try
import scala.io._

import scala.concurrent._
import ExecutionContext.Implicits.global

//Zygohistomorphic prepromorphisms
/*
Used when you really need both semi-mutual recursion and history and to
repeatedly apply a natural transformation as you get deeper into the functor.
Zygo implements semi-mutual recursion like a zygomorphism.
Para gives you access to your result à la paramorphism.
*/


////
///Map, filter, reduce, fold, flatMap ....
////

val list = List(1, 2, 3, 4)

2 :: list  //Different reference to list

val multiply2 = list.map(_ * 2)
multiply2.filter(_ > 2)
val sum = list.reduce(_*_*5)
val acum : Map[String, Int] = list.foldLeft(Map.empty[String, Int]){(ac, el) =>
  ac + (s"$el" -> el)
}

List(None, Some(5), None, Some(7)).flatten



Option("Patata").map(x => x.length)

case class Person(name:String, age:Int)



List(
  Person("Juan", 23),
  Person("Maria", 30)
).filter(_.age > 27)


val fut: Future[Int] = Future{
  Thread.sleep(1000)
  2
}

fut.map(x => s"$x")


//FlatMap

Option("Patata").flatMap(x => Option(x.length))



///
///For comprenhension
///

for (i <- Iterator.range(0, 20);
     j <- Iterator.range(i, 20) if i + j == 32)
  println("(" + i + ", " + j + ")")
//Exercise 8A!!
////
//Errors
///

//2/0  //Aritmetic exception No functional
try{
  Source.fromFile("pepe.txt").getLines()
}catch {
  case e: FileNotFoundException => println("Aritmetic")
  case _: Throwable => println("Error")
}

//Read a file, get the lines without breaking the code
val sizeFile: Try[Int] = Try(Source.fromFile("pepe.txt").getLines()).map( _.toList.length)

////
//Patern Matching //Partial Functions
////

case class Human(name:String, age:Int)

val (jose, pepe, sara) = ( Human("Jose", 12), Human("Pepe", 13), Human("Sara", 21) )
val aux = Option( (Human("Jose", 12), Human("Pepe", 13), Human("Sara", 21)) )

val valuePM = aux match {
  case Some((Human(name, edad), _ , _)) if edad < 20 => name
  case None => "Empty"
  case _ => "Others"
}
valuePM
//Exercise 8B!!

//Exercise 8C!!

