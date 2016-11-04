import java.io.File

sealed trait RandomThing

case class RandomFile(f: File) extends RandomThing
case class RandomString(s: String) extends RandomThing

class RandomNoiseMakes {
	def makeRandomNoise(t: RandomThing) = t match {
		case RandomFile => playSoundFile()
		case RandomString => speak(s)
	}
}