class Person(var firstName: String, var lastName: String) {
    println("the constructor begins")

    //some class fields
    private val HOME = System.getProperty("user.home")
    val age = 0

    //some methods
    override def toString = s"$firstName $lastName is $age years old"
    def printHome { println(s"HOME = $HOME") }
    def printFullName { println(this) } //uses to string

    printHome
    printFullName
    println("still in the constructor")
}

//p.firstName = "Scott"
//p.name_$eq("Metta World Peace")
// - this second form is how scala create the hidden muttator
//println(p.firstName)