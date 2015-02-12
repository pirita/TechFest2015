////
//Options
////

val aux = List(1).find(_ > 4)
aux  //None
aux.getOrElse(25)
val auxSome = List(1).headOption
val some = auxSome.getOrElse(26) // 1
//We can extract the values
val Some(aux2) = auxSome

aux2

///////
//Lists
///////

val list = List(1,2,3,4)
val listTipa = List[Int](1,2,3,4)
1 :: 2 :: 3 :: Nil
list.tail
list.head
val hd :: ht = list

//We can extract the values!!!
hd

ht
////
//Tuples
////

//Tuples it is the only structure that can store values from "different types"
val t1 = (1, 2)
val t2 : (Int, String) = (1, "A")

//Get values
t2._1
t2._2

//We can extract the values!!
val (v1, v2, _) = (1, 2, 3)

println(v1)
println(v2)
/////
//Map
/////
//Key and value can have any type but the map m
Map(1 -> "A", 2 -> "K")

Map[Int, String](1 -> "A", 2 -> "Z")

Map(("2", 2)->5, ("8", 8)->9)

//A map === a list of tuples 2
Map( (2, 5) , (7, 2))

Map(1 -> "A", 2 -> "K").get(1) //Returns an Option


////////
//Vector
////////

Vector(1, 3, 5, 6, 7)
val vector = Vector[Int](1, 3, 5, 6, 7)

//We can extract the values!!!
val vect1 +: vt = vector

vect1

//We can extract from a
////////
//Stream
////////

//Lazy and "infinite"

Stream.from(4)

1 #:: 2 #:: Stream.empty[Int]
//We don't evaluate any element
val auxStream  = Stream(1, 4, 6, 7)

//We can extract from a stream
val firstStream #:: hds = auxStream

val randoms = Stream.fill(1)( Math.random())
println(randoms.head)

println(randoms.drop(1).head)













