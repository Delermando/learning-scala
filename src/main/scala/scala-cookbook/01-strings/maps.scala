//undestanding maps
"HELLO".map(c => (c.toByte + 32).toChart)

//methods on map
//method
def toLower(c: Char) : Char = (c.toByte + 32).toChar

//function
val toLower = (c: Char) => (c.toByte + 32).toChar
"HELLO".map(toLower)

for (c <- "HELLO") yield toLower(c)

//Char vs String
