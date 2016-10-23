package tests

object Adler32checksum {
	val MOD_ADLER = 65521

	def main(args: Array[String]) {
		val sum = adler32checksum("Wikipedia")
		printf("checksum (int) = %d\n", sum)
		printf("checksum (hex) = %s\n", sum.toHexString)
	}

	def adler32checksum(s: String) : Int {
		var a = 1
		var b = 0
		s.getBytes.foreach { char =>
			a = (char + a) % MOD_ADLER
			b = (b + a) % MOD_ADLER
		}

		//note: Int is 32 bits, which this requires
		b * 65521 + a //or (b << 16) + a
	}
}