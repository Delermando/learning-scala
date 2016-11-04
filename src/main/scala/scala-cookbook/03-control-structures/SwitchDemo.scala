import scala.annotation.switch

class SwitchDemo {
	val i = 1
	//val Two = 2

	val x = (i: @switch) match {
		case 1 => "One"
		case 2 => "Two"
		//case Two => "Two"
		case _ => "Other"
	}

	println(x)
}


