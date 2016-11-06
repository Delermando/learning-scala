
////Classes and methods
//class Hello
//
//new Hello()
//
//res0.toString
//
////-----
//class Hello {
//    println("Hello")
//}
//
//new Hello()
//
//// -----
//class Hello(message: String) {
//    println(message)
//}
//
//new Hello("Hello, world!")
//
//new Hello //error
//
//// --imutable fields
//class Hello {
//    val message: String = "Hello"
//}
//
//(new hello).message
//
//// --- mutable field
//class Hello {
//    var message: String = "Hello"
//}
//val hello =  new Hello
//hello.message = "Hello, world!"
//
////specific types
//class Hello {
//    val message = "Hello"
//}
//
//(new Hello).message
//
////promoting class parameters
//class Hello(val message: String)
//val hello = new Hello("Hello, world!")
//hello.message
//
////methods
//def hello = "hello"
//def echo(message: String): String = message
//
////infix method calling
//"Maritn Oderskey".split(" ")
//"Marin Oderskey" split " "
//// only works if the method has only one param
////default arguments
//
//def name(first: String = "", last: String = "") : String =
//    first + " " + last
//
//name("Martin")
////best practive put de arguments without default value first
//def name(first: String
//         last: String,
//         middle: String = "") : String =
//    first + " " + middle + " " + last
//
////## namedarguments
//name(last = "Oderskey")
//name(first = "Martin", last = "Oderskey")
//name(last = "Oderskey", first = "Martin")
//
////### Objects
////singleton pattern
//object Hello {
//    def message = "hello"
//}
//
////other example "factory method" the createTimeFromMinutes instantiate Time class
//object hello {
//    val oneHourInMinutes: Int = 60
//
//    def createTimeFromMinutes(minutes: Int) = 
//        new Time(
//            minutes / oneHourInMinutes,
//            minutes % oneHourInMinutes
//        )
//}
//
////to start a Scala Application create a method "Main" insite a "object"
//object Hello {
//    def main(args: Array[String]) : Unit = 
//        println("Hello")
//}
////Unit is a equivalent to "void"
////now type "compile" on activator after "run"
////or "scala -cp target/scala-2.11/classes/BigDataUniversity" and "run"
//
//