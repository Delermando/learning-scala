//override default acessors and mutators

//error this won't work
class Person(private var name: String) {
    def name = name
    def name_ = (aName: Strig) { name = aName}
}

class Person(provate var _name: String) {
    def name = _name //accessor
    def name_=(aName: String) { _name = aName} //mutator
}

val p = new Person("Dell")
p.name = "teste" //setter
println(p.name) //getter

class Stock(var symbol: String)
val stock = new Stock("a")
stock.symbol = "goog"

//behind the scenes
//stock.symbol_$eq("goog")
