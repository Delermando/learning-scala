Class Complex(real: Double, imaginary, Double) {
	def re = real
	def im = imaginary

	// métodos sem argumentos
	//def im() = imaginary
	// método com argumento

	override def toString() = 
		"" + re + (if (im < 0 ) "" else "+") + im + "i"
	
}