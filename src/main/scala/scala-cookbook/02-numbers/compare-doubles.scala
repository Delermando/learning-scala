
//compare doubles

def ~=(x: Double, y: Double, precision: Double) = {
    if ((x - y).abs < precision) true else false
}

~=(a, b, 0.00001)

a == b


object MathUtils {
    def ~=(x: Double, y: Double, precision: Double) = {
        if ((x - y).abs < precision) true else false
    }
}

//handling very big numbers

var b = BigInt(123456789)
var b = BigDecimal(123456.789)
b + b 
b * b 
b += 1

b.toInt
b.toFloat

b.isValidFloat
b.isValidInt

if (b.isValidInt) b.toInt
