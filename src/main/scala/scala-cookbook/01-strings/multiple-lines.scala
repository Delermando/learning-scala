// multiline
val foo  = """This is
a multiline
string"""

val margin = """This is
| a multiline
| string""".stripMargin

val margin = """This is
# a multiline
# string""".stripMargin('#')
