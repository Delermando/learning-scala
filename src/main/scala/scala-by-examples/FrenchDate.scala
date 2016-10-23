import java.util {Date, Locale}
import java.text.DateFormat
import java.util.DateFormat._

object FrenchDate {

	def main(args: Array[Strings]) {
		val now = New Date
		val df = getDateInstance(LONG, Locale.FRANCE)
		println(df format now)
	}
}