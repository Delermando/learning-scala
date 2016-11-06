1 to 10 
res0.map(n => n + 1)

//Structural sharing
List(1, 2, 3, 4, 5)

res15 :+6
1 +:res16

//what's a sequence
//ordered collection of data
//may os may not be indexed 
//duplicates are permited
//Array, List, Vector
//the apply method on an instance is a lookup

//array 
//a fixed size, ordered sequence of data
//very fast on JVM
//values are contiguous in memory
//indexed by position
//mutable

Array(1, 2, 3, 4, 5)
res20(2)
res20(5)
//error index no exist

//list
//a linked list implementation, with a value and a pointer
//unbouded in size
//duplicated values
//is located in anywhere else in memory
//pointer chasing?
//compare to arrays they are very flexible
List(1, 2, 3, 3, 4)
res26.distinct
//append
res26 :+ 5
//prepend
3 +: res26

//vectors
//a linked list of 32 alement array
//2.15 bilion possible elements
//indexed by hasing 
//good performance across all operations without having to copy arrays when more space is needed

//a set
//A "bag" of data, where no duplicates are permitted 
//order is not guaranteed
//HashSet, TreeSet, BitSet, KeySet, ShortedSet, etc
//The apply method on an instance checks to see if the set contains values
Set(1, 2, 3, 3, 4, 5, 5)
res36 + 0
res36 + 8
res36(9) //false
res36(3) //true
res36.toSeq
res37.toSet

//Option
//Not a collection, but a container
//An ADT representing the existence of a value
//Some is the representation of a value
//None is a representation of the absence os a value
//Allows us to avoid Null on JVM
Option("Jamie")
res46.get
res46.getOrElse("Jane")

Option(null)
res51.get //error
res51.getOrElse("Jane")
//Option allow us to create APIs where the possible abscence of a value is encoded in the type system
//We can then perform behavior without asking whether or not value is null in advance
case class Customer(
    first: String = "",
    middle: Option[String] = None,
    last: String = ""
)
Customer("Martin", last = "Odersky")

//tuples
//A loose aggregation of values into a single container
//Can have up to 22 values in Scala
//Are always used when you see parentheses wrapping data without a specific type
Tuple1("a")
Tuple2(1, "a")
Tuple3(1, "a", 2)
(1, "a")

val tuple = (1, "a", 2, "b")
tuple._2
tuple._3

//desconstruct
val (first, second, third, fourth) = tuple

//tuple2
(1, "a")
(2 -> "b")
(2 -> "c" -> 4)
(2 -> "c" -> 4 -> "d")

//unapply desconstruct a case class 
case class Time(hours: Int = 0, minutes: Int = 0)
val time = Time(9, 0)
Time.unapply(time)

//Maps
//is a group of data by key to value, which are tuple "entries"
//allow you to index value by a specific key for fast access
//commom implementations: HashMap, TreeMap
1 to 5
'a' to 'f'
res71.zip(res73)
//(1,a), (2, b) ...
res75.toMap
//(1 -> a, ...)

Map(1 -> "a", 2 -> "b", 3 -> "c")
res77(2) //b
res77(4) //error
res77.get(4) //none
res77.get(2) //b
res77.getOrElse(1, "z")

//higher order functions
//a function whitch taker another function
//typically describe the "how" for work to be done in a container
//the function passed to it describe the "what" that should be done to elements in the container
1 to 5
res86.map(number => number + 1)
res86.map(_ + 1)

//flatmap
List("Scala", "Python", "R")
res89.map(lang => lang + "#")
res89.flatMap(lang => lang + "#")

List("Scala", "Python", "R", "SQL")
res93.filter(lang => lang.contains("S"))

List(1, 2)
res95.map(println)
res95.foreach(println)

List("Scala", "Simple", "Stella")
res98.forall(lang => lang.contains("S"))
res98.forall(lang => lang.contains("a"))

1 to 5
res103.reduce((acc, cur) => acc + cur)
res103.reduce(_ + _)

List[Int]().reduce((acc, cur) => acc + cur)

1 to 5
res113.foldLeft(0){case (acc, cur) => acc + cur}
List[Int]().foldLeft(0){case (acc, cur) => acc + cur)}

1 to 5
res114.product

1 to 5
res116.exists(num => num == 3) //true
res116.exists(num => num == 7) //false

1 to 5
res121.find(num => num == 3) //3
res121.find(num => num == 0) //None

1 to 5
res124.groupBy(num => num % 2)
res124.groupBy(num => num > 2)

1 to 5
res.takeWhile(num => num < 3) //get 1, 2
res.dropWhile(num => num < 3) //remove 1, 2 and get 3, 4, 5
