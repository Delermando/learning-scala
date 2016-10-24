//handling base and radix
Integer.parseInt("1", 2)
Integer.parseInt("10", 2)
Integer.parseInt("100", 2)
Integer.parseInt("1", 8)
Integer.parseInt("10", 8)

implicit class StringToInt(s: String) {
    def toInt(radix: Int) = Integer.parseInt(s, radix)
}