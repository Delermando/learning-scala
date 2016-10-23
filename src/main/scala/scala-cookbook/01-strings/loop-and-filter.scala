// class
"Hello, World!".getClass.getName

//loop
"Hello, World!".foreach(println)
for(c <- "hello") println(c)
"hello".getBytes.foreach(println)

//filter
val result = "hello, world!".filter(_ != 'l')

//capitalize
"scala".drop(2).take(2).capitalize

