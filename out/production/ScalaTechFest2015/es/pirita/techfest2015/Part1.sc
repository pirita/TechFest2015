//Vals with inference
val integer = 1

val double = 1.0

val jose: String = "Jose"

//Vals without Inference
val noInference: Double = 1

//
//Val, var and def
//

//////var (mutable variables :( :( )
var timeVar = System.currentTimeMillis

//Correct
timeVar = System.currentTimeMillis

//However, the type is defined in the first assignation (static typing)
//error
//timeVar = "Error"

//////val (immutable variables, evaluation only initialization)
val timeVal = System.currentTimeMillis

//Error (IMMUTABLE!!!)
//timeVal = 6

timeVal  //Same value 1
Thread.sleep(12)
timeVal //Same value 2
//////def (immutable functions, evaluation when is called)
def timeDef = System.currentTimeMillis()
timeDef  //Different value 1
Thread.sleep(12)
timeDef //Different value 2

//We can add lazy to a val
timeDef
lazy val aux = Thread.sleep(1000)
timeDef


timeDef
aux // Evaluation!!
timeDef


