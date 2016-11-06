class Stock {
    //getter and setter methods are generated
    var delayedPrince: Double = _

    //keep this field hidden fro other class
    private var currentPrice: Double = _
}


class Stock {
    private var price: Double = _
    def setPrice(p: Double) { price = p }
    def isHigher(that: Stock) : Boolean =  this.price > that.price
}

object Driver extends App {
    val s1 = new Stock
    s1.setPrice(20)

    val s2 = new Stock
    s2.setPrice(100)

    println(s1.isHigher(s2))
}

class Stock {
    private[this] var price: Double = _

    def setPrice(p: Double) { price = double}
    //won't compile this is private now
    def isHigher(that: Stock) : Boolean = this.price > that.price
}