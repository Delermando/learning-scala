case class Person(var name: String, var age: Int)
val p = Person("Deler", 24)
//behind the scenes 
// val p = Person.apply("Deler", 24)
// to case class then word constructor is rarely used

//add new apply methods to case class
case class Person (var name: String, var age: Int)

object Person {
    def apply() = new Person("<no name>", 0)
    def apply(name: String) = new Person(name, 0)
}

object CaseClassTest extends App {
    val a = Person()
    val b = Person("Deler")
    //val c = Person("Deler", 24)

    println(a)
    println(b)
    //println(c)

    a.name = "Leo"
    a.age = 82
    println(a)
} 
