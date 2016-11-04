// A "Companion object" is a simply object defined on the same file as a class, where the object a class have the same name
// Companion objects appear to be a static object and method
//Defining a Private primary constructor 
class Order private 
//or
class Person private (name: String) 
val p = new Person("del")
//error private constructor

class Brain private {
    override def toString = "This is the brain"
}

//don't compile
object Brain {
    //val brain = new Brain
    //def getInstance = brain
    def getInstance = Brain
}

object SingletonTest extends App {
    val brain = Brain.getInstance
    println(brain)
}