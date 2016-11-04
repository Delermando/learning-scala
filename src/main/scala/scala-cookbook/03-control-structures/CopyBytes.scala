import java.io._

object CopyBytes extends App {
	var in = None: Option[FileInputStream]
	var out = None: Option[FileInputStream]

	try {
		in = Some(new FileInputStream("/tmp/Test.class"))
		out = Some(new FileInputStream("/tmp/Test.class.copy"))

		var c = 0
		while ({c = in.get.read; c != -1}){
			out.get.write(c)
		}
	} catch {
		case e: IOException => e.printStackTrace()
	} finally {
		println("entered finally ...")
		if (in.isDefined) in.get.close
		if (out.isDefined).out.get.close
	}

	//or
	try {
		in = Some(new FileInputStream("/tmp/Test.class"))
		out = Some(new FileOutputStream("/tmp/Test.class.copy"))
		in.foreach { inputStream =>
			out.foreach { outputStream =>
				var c = 0
				while ({c = inputStream.read; c != −1}) {
					outputStream.write(c)
				}
			}
		}
	} //
}