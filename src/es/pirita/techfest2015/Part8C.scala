package es.pirita.techfest2015

/**
  * @author Ignacio Navarro Martin
  * @version 1.0
  */
object Part8C {

   def reverse[T](listAux : List[T]) : List[T] = {
     def reverseList[A : T](list : List[A], result: List[A] = Nil) : List[A] = list match {
       case Nil => result
       case x :: xs => reverseList(xs, x :: result)
     }
     reverseList(listAux)
   }
 }
