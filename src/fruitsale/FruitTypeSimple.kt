package fruitsale

class FruitTypeSimple(saleUnit: String, price: Double, name: String) {

    private val saleUnit: String
    private var price: Double
    private val name: String

    init {
        this.saleUnit = saleUnit
        this.price = price
        this.name = name
    }

    //secondary constructor
    constructor(price: Double) : this("Lone", price, "Thayat Thee") {

    }
}