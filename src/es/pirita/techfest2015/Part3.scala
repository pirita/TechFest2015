package es.pirita.techfest2015

import scala.annotation.tailrec

/**
 * @author Ignacio Navarro Martin
 * @version 1.0
 */
object Part3 extends App{
  
  @tailrec
  def fibonacci(n: Long): Long = {
    if (n < 1) 1
    else fibonacci(n-1)
  }
}

