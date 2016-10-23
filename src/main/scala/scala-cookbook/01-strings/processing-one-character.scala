// processing one character
"hello, world".map(c => c.toUpper)
"hello, world".map(_.toUpper)

val uper = "Hello World".filter(_ != 'l').map(_.toUpper)
for(c <- "Hello") println(c.toUpper)
val upper = for(c <- "Hello") yield c.toUpper

val result = for {
	c <- "Hello, world!"
	if c != 'l'
} yield c.toUpper

