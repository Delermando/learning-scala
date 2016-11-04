//	Controlling the Visibility of Constructor Fields
// var
class Person(var name: String)
val p = new Person("andre")
p.name
p.name = "dell"
p.name

//val
class Person(val name: String)
val p = new Person("andre")
p.name
p.name = "dell"
//error

//fields withoud var or val
class Person(name: String)
val p = new Person("andre")
p.name
//error

//private
class Person(private var name: String) {def getName{ println(name)}}
val p = new Person("dell")
p.name

//case class are val by default
case class Person(name: String)
val p = new Person("dell")

//defining auxiliary constructors

