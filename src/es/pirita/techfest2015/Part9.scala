package es.pirita.techfest2015

/**
 * @author Ignacio Navarro Martin
 * @version 1.0
 */

object StringUtils{
  implicit class StringImprove(val s: String){
    def plusN(n: Int) : String = s"$s $n"
  }
}

object Part9 extends App{
  ////
  ///Implicits
  ///

  //View
  //implicit def strToInt(x: String): Int = x.toInt
  //val y: Int = "123"

  //Variables implicitas
  //class Prefixer(val prefix: String)
  //def addPrefix(s: String)(implicit p: Prefixer) = p.prefix + s

  //Pimp my library
  //String is final

  import StringUtils._

  "23" plusN 25
}
