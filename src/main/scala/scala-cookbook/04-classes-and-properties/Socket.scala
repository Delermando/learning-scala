class Socket(val timeout: Int = 1000)
val s = new Socket
s.timeout

//or 

val s = new Socket(5000)
s.timeout

//or named parameters

val s = new Socket(timeout = 8000)
s.timeout

//or

class Socket(val timeout: Int) {
    def this() = this(1000)
    override def toString = s"timeout: $timeout"
}

//multiple parameters
//your class now appear thave three construstors
class Socket(val timeout: Int = 1000, val linger: Int = 2000) {
    override def toString = s"timeout: $timeout, linger: $linger"
}

println(new Socket)
println(new Socket(3000))
println(new Socket(3000, 8000))

//using named parameters
println(new Socket(timeout=100, linger=200))
println(new Socket(linger=200, timeout=100))
println(new Socket(linger=200))
println(new Socket(timeout=100))