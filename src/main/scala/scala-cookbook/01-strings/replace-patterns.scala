//replacing patterns
// replace
val margin = """This is
# a multiline
# string""".stripMargin.replaceAll("\n", " ")


val numPattern = "[0-9]+".r
val address = "123 Main Street Suite 101"
val newAddress = numPattern.replaceAllIn(address, "x")
val newAddress = numPattern.replaceFirstIn(address, "x")

//extracting parts of a string
val pattern = "([0-9]+) ([A-Za-z]+)".r
val pattern(count, fruit) = "100 Bananas"


val MoviesZipRE = "movies (\\d{5})".r
val MoviesNearCityStateRE = "movies near ([a+z]+), ([a-z]{2})"

textUserType match {
	case MoviesZipRE(zip) => getSearchResults(zip)
	case MoviesNearCityStateRE(city, state) => getSearchResults(city, state)
	case _ => println("did not match a regex")
}
