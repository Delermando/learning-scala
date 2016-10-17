def fibo(num: Int) : BigInt = fiborec(num, 1, 0)

//@tailrec def fiborec(
def fiborec(
	num: Int, 
	nxt: BigInt, 
	res: BigInt
): BigInt = num match {
	case 0 => res
	case _ => fiborec(num - 1, nxt + res, nxt)
}

println(fibo(1000000) + "\n")