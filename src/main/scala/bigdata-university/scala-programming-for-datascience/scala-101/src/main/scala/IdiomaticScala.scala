//composing HOFs
val myNums = 1 to 3
myNums.map(i => (1 to i).map(j => i * j))
myNums.flatMap(i => (1 to i).map(j => i * j))

val myNums = 1 to 3
for {
    i <- myNums
    j <- 1 to i
} yield i * j 


val myNums = 1 to 3
for {
    i <- myNums if i % 2 == 1
    j <- 1 to i
} yield i * j 

//definitions
for {
    time <- times
    hours = time.hours if hours > 12
} yield (hours - 12 ) + "pm"

for (n <- 1 to 3) println(n)

//pattern matching
def isCustomer(someValue: Any): Boolean = {
    someValue match {
        case cust: Customer => true
        case _ => false
    }
}

case class Customer(first: String = "", last: String = "")

Customer("Martin", "Odersky")
isCustomer(res152)
isCustomer("Martin Odersky")

val tuple = (1, "a", 2, "b")
tuple._3
val (first, second, third, fourth) = tuple

//pattern matching on a option
def getMiddleName(value: Option[String]): String = {
    value match {
        case Some(middelName) => middelName
        case None => "No middle name"
    }
}

case class Customer(first: String = "", middle: Option[String] = None, last: String = "") 
val martin = Customer("Martin", last = "Odersky")
getMiddleName(martin.middle)

val jane = Customer("Jane", Option(".D"), "Doe")
getMiddleName(jane.middle)

//HOFs and Option
Option("Martin")
res166.map(name => println("Yay, " + name))
res166.foreach(name => println("Yay, " + name))
None.foreach(name => println("Yay, " + name))

val martin = Option("Martin")
val jane = Option("Jane")

for {
    m <- martin
    j <- jane
} yield (m + " is friends with " + j)

//JVM Exceptions
//NullPointerException (runtime)
//ClassCastException (runtime)
//IOException (check)

import scala.util.{Try, Success, Failure}
Try("100".toInt)
Try("Martin".toInt)

def toString(s: String): Int {
    try {
        s.toInt
    } catch {
        case _: NumberFormatException => 0
    }
}


def makeInt(s: String): Int = Try(s.toInt) match {
    case Success(n) => n
    case Failure(_) => 0
}

makeInt("34")
makeInt("aa")

//Higher Order functions inside a Try
import scala.util._

def getScala: Try[String] = Success("Scala")
val scala = getScala
scala.map(s => s.reverse)

def getOuch: Try[String] = Failure(new Exception("Ouch"))
val ouch = getOuch
ouch.map(s => s.reverse)

Success("Scala").map(_.reverse)
for {
    language <- Success("Scala")
    behavior <- Success("rocks")
} yield s"$language $behavior"

//Futures 
//allow us to define wor that may happen at some later time, 
//possibly on another thread
//futures return a Try of whether or not the works was succefully completed
//to use a Future you must provide a thread Pool that the Future
//can use to perform work
//I can use a "implicit" val to declare it one time and automatically apply it to all usages with a scope

//required imports to use Future concurrence
import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import java.util.concurrent.ForkJoinPool
import scala.util.Failure
import scala.util.Success
import scala.concurrent.duration._

implicit val ec: ExecutionContext = ExecutionContext.fromExecutor(new ForkJoinPool())
implicit val timeout = 1 second

//hom many items we have of a specific book
val f: Future[Int] Future {
    inventoryService.getCurrentInventory(1234567L)
}

//pattern matching on future
val f: Future[Int] = Future {1 + 2 + 3}
f.onComplete {
    case Success(i) => println("onComplete Success: " + i)
    case Failure(f) => println("onComplete Failure: " + f)
}

val g: Future[Int] = Future {1 + 2 + 3}
g.map(result => println("Mapping: "+ result))