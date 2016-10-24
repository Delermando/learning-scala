//randon numbers
val rand = scala.util.Random
r.nextInt(100)
r.nextFloat
r.nextDouble

val rand = scala.util.Random(100)
rand.setSeed(1000L)

// random character
rand.nextPrintableChar

//random length range of numbers
var range = 0 to n.nextInt

for (i <- 0 to r.nextInt(10)) yield i * 2
for (i <- 0 to r.nextInt(10)) yield i * r.nextFloat
for (i <- 0 to r.nextInt(10)) yield r.nextPrintableChar

for (i <- 1 to 5) yield r.nextInt(100)

//range of elements
val a = 1 to 10
val a = 1 to 10 by 2
val a = 1 to 10 by 3
val a = 1 to 10 by 3 toArray
val a = 1 to 10 by 5 toList

for (i <- 1 to 5) println(i)

//por deibaixo dos panos
1.to(10)
