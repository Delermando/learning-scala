class Pizza () {

    var crustSize = 0
    var crustType = ""

    def this(crustSize: Int) {
        this()
        this.crustSize = crustSize
    }

    def this(crustType: String) {
        this()
        this.crustType = crustType
    }

    override def toString = s"A $crustSize inch pizza with a $crustType crust"
}