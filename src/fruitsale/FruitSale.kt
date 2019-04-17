package fruitsale

class FruitSale {

    var saleItems: ArrayList<SaleItem> = ArrayList()

    fun addSaleItem(fruitType: FruitType, quantity: Int) {
        val newSaleItem = SaleItem(fruitType, quantity)
        saleItems.add(newSaleItem)
    }

    fun showSaleSummary() {
        println("Sale Summary")
        var totalPrice = 0.0
        for (saleItem in saleItems) {
            val subTotal = saleItem.quantity * saleItem.fruitType.price
            println("${saleItem.fruitType.name} " +
                        "${saleItem.fruitType.price} mmk  for ၁${saleItem.fruitType.saleUnit} " +
                        ": ${saleItem.quantity}${saleItem.fruitType.saleUnit} - $subTotal mmk")
            totalPrice += subTotal
        }
        println("Total : $totalPrice mmk")
    }
}