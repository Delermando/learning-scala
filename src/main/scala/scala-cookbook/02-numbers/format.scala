
//formating numbers and currency
val pi = scala.math.Pi
println(f"$pi%1.5f")
"%1.5f".format(pi)

// add comma
val formatter = java.text.NumberFormat.getIntegerInstance
formatter.format(1000)
formatter.format(1000000)

// add dot

val locale = new java.util.Locale("de", "DE")
val formatter = java.text.NumberFormat.getIntegerInstance(locale)
formatter.format(1000)

//currency

val formatter = java.text.NumberFormat.getCurrencyInstance
println(formatter.format(1000))

import java.util.{Locale, Currency}
val de = Currency.getInstance(new Locale("de", "DE"))
formatter.setCurrency(de)
println(formatter.format(1234567.89))