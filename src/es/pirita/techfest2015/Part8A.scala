package es.pirita.techfest2015

/**
 * @author Ignacio Navarro Martin
 * @version 1.0
 */
object Part8A {

  def headsSum(list1: List[Int])(list2: List[Int])(list3: List[Int]) : Option[Int] = {
    for {
      h1 <- list1.headOption
      h2 <- list2.headOption
      h3 <- list3.headOption
    } yield h1 + h2 + h3
  }
}
