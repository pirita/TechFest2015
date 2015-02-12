package es.pirita.techfest2015

/**
  * @author Ignacio Navarro Martin
  * @version 1.0
  */
object Part8B {

   def leapYear(year: Int): Boolean = year match {
     case year if year % 4 != 0 => false
     case year if year % 100 != 0 => true
     case year if year % 400 != 0 => false
     case _ => true
   }
 }
