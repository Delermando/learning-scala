// s string interpolation
// s"aasdasd" create a processed literal string
val name = "Delermando"
val age = 33
val weight = 200.00
val result = s"$name is $age years old, and weighs $weight pounds."
println(s"$name is $age years old, and weighs $weight pounds.")

// string interpolation expression
println(s"Age next year ${age + 1}")

println(s"You are 33 year old: ${age == 33}")

// string interpolation object fields
case class Student(name: String, score: Int)
val hannah = Student("Hannah", 95)
println(s"${hannah.name} has a score of ${hannah.s score}")

// f string interpolation
println(f"$name is $age years old, and weighs $weight%.3f pounds.")
println(f"$name is $age years old, and weighs $weight%.0f pounds.")
val out = f"$name is $age years old, and weighs $weight%.0f pounds."

// raw interpolation

val teste = s"Delermado \nSantos"
val teste = raw"Delermado \nSantos"

// case a verion prior to 2.10 
val name = "Fred"
val age = 33
val s = "%s is %d years old".format(name, age)

