//exception

def toInt(s: String) : Option[Int] = {
    try {
        Some(s.toInt)
    } catch {
        case e: NumberFormatException => None
    }
}

toInt("1").getOrElse(0)
toInt("b").getOrElse(0)

toInt("1") match {
    case Some(n) => println(n)
    case None => println("Boom! That wasn't a number")
}

val a = toInt("b") match {
    case Some(x) => x
    case None => 0
}