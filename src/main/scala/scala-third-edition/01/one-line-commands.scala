for(i <- Array(1,2,3)) println(i)
for(i <- Array(1,2,3)) yield i * 2
Array(1,2,3).map(_ * 2)
val nums = List(1,2,3,4,5,6,7).filter(_ < 5)
val nums = List(1,2,3,4,5,6,7).filter(_ < 5).map(_ * 2)
Array(1,2,3).foreach(println)

