//pattern match
def echoWhatYouGaveMe(x:  Any) : String = x match {
    case 0 => "zero"
    case true => "true"
    case "hello" => "you said hello"
    case Nil => "an empty list"

    case List(0, _, _) => "a three elemt list with 0 as the first element"
    case List(1, _*) => "a list beginning with 1, having any number of elements"
    case Vector(', _*) => "a vector starting with 1, having an any number of elements"

    case (a, b) => s"got $a and $b"
    case (a, b, c) => s"got $a, $b, $c"

    case Person(first, "Alexander") => s"found a Alexander, first name = $first"
    case Dog("Suka") => "Found a dog nammed Suka"

    case s: String => s"you game me this string: $s"
    case i: int => s"Thanks for the int: $i"
    case f: Float => s"thanks for the float: $f")
    case a: Array[String] => s"an arrayof strings: ${as.mkString(",")}"
    case d: Dog => "dog: s{d.name}"
    case list: List[_] => s"thanks for the list: $litst"
    //case list: List[x] => s"thanks for the list: $litst"
    case m: Map[_, _] => m.toString
    //case m: Map[a, b] => m.toString

    case _ => "Unknow"

}

object LargeMatchTest extends App {
    case class Person(firstName: String, lastName: String)
    case class Dog(name: String)
    // trigger the constant patterns
    println(echoWhatYouGaveMe(0))
    println(echoWhatYouGaveMe(true))
    println(echoWhatYouGaveMe("hello"))
    println(echoWhatYouGaveMe(Nil))
    // trigger the sequence patterns
    println(echoWhatYouGaveMe(List(0,1,2)))
    println(echoWhatYouGaveMe(List(1,2)))
    println(echoWhatYouGaveMe(List(1,2,3)))
    println(echoWhatYouGaveMe(Vector(1,2,3)))
    // trigger the tuple patterns
    println(echoWhatYouGaveMe((1,2)))
    println(echoWhatYouGaveMe((1,2,3)))
    // two element tuple
    // three element tuple
    // trigger the constructor patterns
    println(echoWhatYouGaveMe(Person("Melissa", "Alexander")))
    println(echoWhatYouGaveMe(Dog("Suka")))
    // trigger the typed patterns
    println(echoWhatYouGaveMe("Hello, world"))
    println(echoWhatYouGaveMe(42))
    println(echoWhatYouGaveMe(42F))
    println(echoWhatYouGaveMe(Array(1,2,3)))
    println(echoWhatYouGaveMe(Array("coffee", "apple pie")))
    println(echoWhatYouGaveMe(Dog("Fido")))
    println(echoWhatYouGaveMe(List("apple", "banana")))
    println(echoWhatYouGaveMe(Map(1->"Al", 2->"Alexander")))
    println(echoWhatYouGaveMe("33d"))
}