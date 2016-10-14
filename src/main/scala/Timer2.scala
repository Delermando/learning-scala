object Timer2 {
	def oncePerSecond(callback: () => Unit) {
		while (true) {callback(); Thread sleep 1000}
	}

	def main(args: Array[String]) {
		oncePerSecond(() => println("O tempo corre como um raio..."))
	}
}