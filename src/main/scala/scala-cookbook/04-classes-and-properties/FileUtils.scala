//utility classes 
object FileUtils {
    def readFile(filename: String) = {
        //code here
    }

    def writeToFile(filename: String, contents: String) {
        //code here
    }
}

val contents = FileUtils.readFile("input.txt")
FileUtils.writeToFile("output.txt", contents)

//won't compile
//val utils = new FileUtils

