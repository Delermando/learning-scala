class Hello {
    private val message : String = "Hello!"
}

class Welcome {
    val message : String = "Hello"
}

//companion objects is when a class and a object file share the 
//same folder and have the same name. Companions class can 
//access private methods and fields insie a object

object Hello {
    private val defaultMessage: String = "Hello"
}

class Hello(message: String = Hello.defaultMessage) {
    println(message)
}

//case classes
//when you create a case class the compiler generate a companion for you and add to object an apply
//which is as factory for that time instance

case class Time(hours: Int = 0, minutes: Int = 0)
val time = Time(9,0)
time == Time(9)
time == Time(9, 30)
time.hours

case class time
//compile error a case class without parameters must be a case object
case object Time
Time.toString

//type versus terms
// A type is a description of a concept in a application (costumers, clients etc)
// A term is concrete representation of a type (instance, method etc)
case class Time(hours: Int = 0, minutes: Int = 0)
val time = Time(9, 0)
time == Time(9, 0)

//Time(9) is the same of Time.apply(9)

//apply example

object Reverse {
    def apply(s: String): String =
        s.Reverse
}

Reverse("Hello")
//olleH
//call the apply method

//another example
Array(1, 2, 3)
//res0(0)

//Unapply deconstruct a case class
case class Time(hours: Int = 0, minutes: Int = 0)
val time = Time(9, 0)
Time.unapply(time)

//and give me the representation of time values

//// Syntetic methods
//equals -> permiti comparar os valores dentro de duas instancias diferentes
//hashCode
//toString
//copy

case class Time(hours: Int = 0, minutes: Int = 0)
var time = Time(9, 0)

//immutability and thread safety
case class Customer(firstName: String = "", lastName: String = "")
@volatile var customer = Customer("Martin", "Odersky")
customer = customer.copy(lastName = "Doe")