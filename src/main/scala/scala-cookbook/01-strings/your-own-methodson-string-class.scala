// accessing a character and an string
"hello".charAt(1)
"hello"(2)
"hello".apply(2)

// add your own  methods to string class
implicit class StringImprovements(s: String) {
	def increments = s.map(c => (c + 1).toChar)
}

val result = "HAL".increments

//scala prio 2.10

class StringImprovements(s: String) {
	def increments = s.map(c => (c + 1).toChar)
}

implicit def stringToString(s: String) = new StringImprovements(s)

///
class StringImprovements(s: String) {
	def increments = s.map(c => (c + 1).toChar)
	def decrements = s.map(c => (c - 1).toChar)
	def hideAll = s.replace(".", "*")
	def plusOne = s.toInt + 1
	def asBoolean = s match {
		case "0" | "zero" | " " => false
		case _ => true
	}
}