//Finding Patterns

val numPattern = "[0-9]+".r
//or
import scala.util.matching.Regex
val numPattern = new Regex("[0-9]+")
//
val address = "123 Main Street Suite 101"

val match1sr = numPattern.findFirstIn(address)
val matchAll = numPattern.findAllIn(address)

matchAll.foreach(println)

val matchAll = numPattern.findAllIn(address).toArray	

//none, some
val address = "Main Street Suite"
val match1sr = numPattern.findFirstIn(address)

val result = numPattern.findFirstIn(address).getOrElse("no match")

//
val address = "123 Main Street Suite 101"
val match1sr = numPattern.findFirstIn(address)


match1sr.foreach{ e =>
	println(s"Found: $e")
}

match1sr match {
	case Some(s) => println(s"Found: $s")
	case None =>
}
