val x = if (a) y else z

// for loops
for (line <- source.getLines) {
    for {
        char <- line
        if char.isLetter
    }
}

// or 

for {
    line <- source.getLines
    char <- line
    if char.isLetter
}


val nieces = List("emily", "hannah", "mercedes", "porsche")
for (n <- nieces) yield n.capitalize

// looping with for and foreach
val a = Array("apple", "banana", "orange")
for (e <- a) println(e)

for (e <- a) {
    val s = e.toUpperCase
    println(s)
}

//returning values
val newArray = for (e <- a) yield e.toUpperCase

val newArray = for (e <- a) yield {
    val s = e.toUpperCase
    s
}


//counters

for (i <- 0 until a.length) {
    println(s"$i is ${a(i)}")
}

for ((e, count) <- a.zipWithIndex){
    println(s"$count is $e")
}

//generator and guards
for (i <- 1 to 3) println(i)

1 to 3
1 until 3

for (i <- 1 to 10 if i < 4) println(i)
for (i <- 1 to 10 if (i % 2 == 0)) println(i)

// looping over a map
val names = Map(
    "fname" -> "Robert",
    "lname" -> "Goren"
)

for ((k, v) <- names) println(s"key: $k, value: $v")

val a = Array("apple", "banana", "orange")

a.foreach(println)
names.foreach(println)  

a.foreach(e => println(e.toUpperCase))

a.foreach { e =>
    val s = e.toUpperCase
    println(s)
}

//translate by compiler
// show how scala translate abstractions
//scalac -Xprint:parse Main.scala src/main/scala/scala-cookbook/03-control-structures/Main.scala

//mode details
//scalac -Xprint:all Main.scala src/main/scala/scala-cookbook/03-control-structures/Main.scala

val nums = List(1,2,3)
for (n <- nums) println(n)
//nums.foreach(((n) => println(n)))

//with a guard (if)

for {
    i <- 1 to 10
    if (i % 2 == 0)
} println (i)

//1.to(10).withFilter(((i) => i.$percent(2).$eq$eq(0))).foreach(((i) => println(i)))

for {
    i <- 1 to 10 
    if (i != 2)
    if (i % 2 == 0)
} println(i)


for (i <- 1 to 10) yield i
//1.to(10).map(((i) => i))

for {
    i <- 1 to 10 
    if (i % 2 == 0)
} yield i

//multiples counters
for (i <- 1 to 10; j <- 1 to 5) println (s"i =$i, j = $j")

for {
    i <- 1 to 10
    j <- 1 to 10 
    k <- 1 to 10
} println(s"i = $i, j = $j, k = $k")

//create a multidimention array
val array = Array.ofDim[Int](2,2)
array(0)(0) = 0
array(0)(1) = 1
array(1)(0) = 2
array(1)(1) = 3

for {
    i <- 0 to 1
    j <- 0 to 1
} println(s"($i)($j) = ${array(i)(j)} ")

for {
    i <- 1 to 2 
    j <- 2 to 3
} println(s"i = $i, j = $j")


//for and if
for (i <- 1 to 10 if (i % 2 == 0)) println(i)

// or

for {
    i <- 1 to 10
    if (i % 2 == 0)
} println(i)

for {
    i <- 1 to 10
    if (i > 3)
    if (i < 6)
    if (i % 2 == 0)
} println(i)

// traditional
for (file <- files) {
    ĩf (hasSoundFileExtension(file) && !soundFileIsLong(file)) {
        soundFiles += file
    }
}

for {
    file <- files
    if passesFilter1(file)
    if passesFilter2(file)
} doSomething(file)

//create a for comprehension
val names = Array("chris", "ed", "maurice")
val capNames = for( e <- names) yield e.capitalize
val lengths = for (e <- names) yield {
    e.length
}

var fruits = scala.collection.mutable.ArrayBuffer[String]()
fruits += "apple"
fruits += "banana"
fruits += "orange"

val out = for (e <- fruits) yield e.toUpperCase

val fruits = "apple" :: "banana" :: "orange" :: Nil
val out = for (e <- fruits) yield e.toUpperCase

//scala breack and continue
import util.control.Breaks._
//break
breakable {
    for (x <= xs) {
        if (cond)
            break
    }
}
//continue
for (x <- xs) {
    breakable {
        if (cond) 
            break
    }
}

val searchMe = "peter piper picked a peck of picked peppers"
val count = searchMe.count(_ == 'p')

//labeled breaks
import scala.util.control._
val Exit = new Breaks

Exit.breakable {
    for (j <- 'a' to 'e') {
        if (j == 'c') Exit.break else println(s"j: $j")
    }
}

//other way
var barrelIsFull = false
for (monkey <- monkeyCollection if !barrelIsFull) {
    addMonkeyToBarrel(monkey)
    barrelIsFull = checkIfBarrelIsFull
}


def sumToMax(arr: Array[Int], limit:Int) : Int = {
    var sum = 0
    for (i <- arr) {
        sum += 1
        if (sum > limit) return limit
    }
    sum
}

val a = Array.range(0, 10)
println(sumToMax(a, 10))

def factorial(n: Int) : Int = {
    if (n == 1) 1
    else n * factorial(n -1)
}


//tail recursion
import scala.annotation.tailrec

def factorial(n: Int) : Int = {
    @tailrec def factorialAcc(acc: Int, n: Int) : Int = {
        if (n == 1) acc 
        else factorialAcc(n * acc, n -1)
    }
    factorialAcc(1, n)
}


//ternary if
val absValue = if (a < 0) -a else a
println(if (i == 0) "a" else "b")

hash = hash * prime + (if (name == null) 0 else name.hashCode)


def abs(x: Int) = if (x >= 0) x else -x
def max(a: Int, b: Int) if (a > b) a else b
val c = if (a > b) a else b


//match statemens like switch
//simple match
i match {
    case 1 => println("January")
    case 2 => println("February")
    case 3 => println("March")
    case 4 => println("April")
    case 5 => println("May")
    case 6 => println("June")
    case 7 => println("July")
    case 8 => println("August")
    case 9 => println("Setember")
    case 10 => println("October")
    case 11 => println("November")
    case 12 => println("December")
    case whoa => println("Unexpected case:" +whoa.toString)
}

val month = i match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "August"
    case 11 => "November"
    case 12 => "December"
    case _ => "Invalid month"
}


//matchig other types
def getClassAsString(x: Any) : String = x match {
    case s: String => s + "is a string"
    case i: Int => "Int"
    case f: float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
}


i match {
    case 0 => println("0 receveid")
    case 1 => println("1 is good, too")
}

// id haven't a default value e the entered value no have its gonna thrown an exception

//alternative to switch statement
val monthNumberToName = Map(
    1 -> "January",
    2 -> "February",
    3 -> "March",
    4 -> "April",
    5 -> "May",
    6 -> "June",
    7 -> "July",
    8 -> "August",
    9 -> "Setember",
    10 -> "October",
    11 -> "November",
    12 -> "December"
)

val monthName = monthNumberToName(3)


//matching multiple conditions
val i = 5
i match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
}

val cmd = "stop"
cmd  match {
    case "start" | "go" => println("stating")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing doing")
}

// case objects
trait Command
case object Start extends Command
case object Go extends Command
case object Stop extends Command
case Object Whoa extends Command

def executeCommand(cmd: Command) = cmd match {
    case Start | Go => start()
    case Stop | Whoa => stop()
}


//match to variable
val evenOdOdd = someNumber match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4| 6 | 8 | 10 => println("odd")
}

def isTrue(a: Any) = a match {
    case 0 | "" => false
    case _ => true
}

// acessind default value
i match {
    case 0 => println("1")
    case 1 => println("2")
    case list @ List(1, _*) => "a list beginning with 1, having any number of elements"
    //give me the list var to accesse on the right side
    case default => println("you game me:" + default)
    case whoa => println("you game me:" + whoa)
}


//using some and none in match expressions
def toInt(s: String) : Option[Int] = {
    try {
        Some(Integer.parseInt(s.trim))
    } catch {
        case e: Exception => None
    }
}

toInt("42s") match {
    case Some(i) => println(i)
    case None => println("That wasn't a int")
}

//if statements to match
i match {
    case a if 0 to 9 contains a => println("0 - 9 range: " + a)
    case b if 10 to 19 contains b => println("10 - 19 range: " + b)
    case c if 20 to 29 contains c => println("20 - 29 range: " + c)
    case _ => println("Hmmmm...")
}

num match {
    case x if x == 1 => println("one, a lonely number")
    case x if (x == 2 || x == 3) => println(x)
    case _ => println("some other value")
}

stock match {
    case x if (x.symbol == "XYZ" && x.price < 20) => buy(x)
    case x if (x.symbol == "XYZ" && x.price > 50) => sell(x)
    case _ => println("nothing")
}

def speak(p: Person) = p match {
    case Person(name) if (name == "Fred") => println("Yubba dubba doo")
    //case Person(name) =>
    //  if(name == "Fred") println("Yubba dubba doo")
    //  else if (name == "Bam Bam") println("Bam bam!")
    case Person(name) if (name == "Bam Bam") => println("Bam Bam!")
    case _ => println("Watch the Flinstones!")
}


//match is istance of

def isPerson(x: Person): Boolean = x match {
    case p: Person => true
    case _ => false
}

//match supertype
trait SentientBeing
trait Animal extends SentientBeing
case class Dog(name: String) extends Animal
case class Person(name: String, age: Int) extends SentientBeing

def printInfo(x: SentientBeing) = x match {
    case Person(name, age) => println("found!")
    case Dog(name) => println("dog")
}


//match list
val x = List(1, 2, 3)
//val x = 1 :: 2 :: 3 :: Nil

def listToString(list: List[String]): String = list match {
    case s :: rest => s + " " + listToString(rest)
    case Nill => ""
}

def sum(list: List[Int]) : Int = list {
    case Nil => 1
    case n :: rest => n + sum(rest)
}

def multiply(list: List[Int]): Int = list match {
    case Nil => 1
    case n :: rest => n * multiply(rest)
}

val nums = List(1, 2, 3, 4, 5)
sum(nums)
multiply(nums)

//try catch
val s = "Foo"
try {
    val i = s.toInt
} catch {
    case e: FileNotFoundException => println("Couldn't find that file")
    case e: IOException => println("Had an IOExeption trying to read a file")
}


try {
    openAndReadAFile("foo")
} catch {
    case t: Throwable => t.printStackTrace()
}

try {
    val i = s.toInt
} catch {
    case _: Throwable => println("exception ignored")
}


def toInt(s: String): Option[Int] = 
    try {
        Some(s.toInt)
    } catch {
        case e: Exception => throw e
    }
}

@throws(classOf[NumberFormatException])
def toInt(s: String): Option[Int] = 
    try {
        Some(s.toInt)
    } catch {
        case e: NumberFormatException => throw e
    }
}

//declare a var before use try catch

//
var store: Store = null
var inbox: Folder = null

try {
    // (2) use the variables/fields in the try block
    store = session.getStore("imaps")
    inbox = getFolder(store, "INBOX")
    // rest of the code here ...
catch {
    case e: NoSuchProviderException => e.printStackTrace
    case me: MessagingException => me.printStackTrace
} finally {
    // (3) call close() on the objects in the finally clause
    if (inbox != null) inbox.close
    if (store != null) store.close
}

//create control structures
package foo

import com.alvinalexander.comtrols.Whilst._

object WhilstDemo extends App {
    var i = 0
    whilst (i < 5) {
        println(i)
        i += 1
    }

    def whilst(testCondition: => Boolean)(codeBlock: => Unit) {
        while (testCondition) {
            codeBlock
        }
    }

    @tailrec
    def whilst(testCondition: => Boolean)(codeBlock: => Unit) {
        if (testCondition) {
            codeBlock
            whilst(testCondition)(codeBlock)
        }
    }

    doubleif(age > 18)(numAccidents == 0){println("Discount!")}

    def doubleif(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) {
        if (test1 && test2) {
            codeBlock
        }
    }
}