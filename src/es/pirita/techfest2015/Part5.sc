////
//Options
////

val aux = List(1).find(_ > 4)
aux  //None
aux.getOrElse(25)

val auxSome = List(1).headOption

val some = auxSome.getOrElse(26) // 1

///////
//Lists
///////

val list = List(1,2,3,4)
1 :: 2 :: 3 :: Nil
list.tail
list.head
list.


