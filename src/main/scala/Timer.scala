object Timer {
	def oncePerSecond(callback: () => Unit) {
		while (true) {callback(); Thread sleep 1000}
	}

	def timeFlies() {
		println("O tempo corre como um raio...")
	}

	def main(args: Array[String]) {
		oncePerSecond(timeFlies)
	}
}