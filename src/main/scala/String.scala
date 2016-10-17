object ImplicitPimp extends App {
	implicit class PimpedStrind(original: String) {
		def strong = s"<strong>$original</strong>"
		def em = s"<em>$original</em>"
	}

	println("Hello world!".strong.em)
}