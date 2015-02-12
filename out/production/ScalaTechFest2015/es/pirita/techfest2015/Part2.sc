//////
//Inference
//////

//The compiler inference the return type (the last line)
def sumInference(n1: Int, n2: Int) = n1 + n2

//Or you can specify the return type
def sum(n1: Int, n2: Int): Int = n1 + n2

//You can define a function with a body, it returns the last one
//DON'T USE return
def sumLines(n1: Int, n2: Int): Int = {
  val aux = n1 + n2
  aux
}

//////
//Name parameters & default value
/////
def printName(first:String, last:String = "Doe") = {
  println(first + " " + last)
}

// Prints "John Smith"
printName("John","Smith")
// Prints "John Smith"
printName(first = "John",last = "Smith")
// Prints "John Smith"
printName(last = "Smith",first = "John")
// Prints "John Doe"
printName(first = "John")


/////
//Arity 0
/////

def noSide = 12
def side() = println(34)

//noSide() Error
noSide

side()
side

/////
//Arity 1 as a method!! Only methods!!
/////

List(1, 2, 3) :+ 24
List(1, 2, 3).:+(24)

////
//polymorphism
////

def concat(n1: String, n2: Int) = n1 + n2

def concat(n1: String, n2: String) = n1 + n2

//Currying
//A function of N parameters can be seen as a function of 1 parameter
//that returns a function of N-1 parameters

def plus(n1: Int)(n2: Int): Int = n1 + n2

def plusSame: Int => Int => Int = n1 => n2 => n1 + n2

//You can specify a parameter

def plus3 = plus(3)_

plus3(5) //returns 8!!

//You can pass a function as a parameter

def sumAndMultiply(n: Int)(m: Int)(f: Int => Int) : Int = f(n*m)

sumAndMultiply(2)(5)(plus3)

//////
//Anonymous functions , lambdas
//////
(x: Int) => x * x
val lambda: Int => Int = _ + 1 //_ placeholder, we don't care about the value


//Exercise 1!!

