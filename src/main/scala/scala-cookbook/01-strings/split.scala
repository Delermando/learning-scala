// split
"hello world !".split(" ")
"hello world !".split(" ").foreach(println)

// split e trim
val s = "eggs, milk, butter, coco puffs"
s.split(",").map(_.trim)


// split regex
val name = "Delermando dos Santos Miranda"
name.split("\\s+")
