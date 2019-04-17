package fruitsale

import java.util.*

fun main(args: Array<String>) {
    println("======== Fruit Sale for Feb 12th ========")

    var dailySummaryOrSale: Char
    val scanner = Scanner(System.`in`)
    val fruitSales = ArrayList<FruitSale>()
    do {
        println("\'D\' for Daily Summary")
        println("\'S\' for Start making a new sale")
        print("Please type your input : ")

        dailySummaryOrSale = scanner.next()[0]

        val fruitSale = FruitSale()
        if (dailySummaryOrSale == 'S') {
            FruitRecord.showFruitRecord()

            var fruitTypeOrF: Char
            do {
                print("Pls input the fruit type for \'F\' : ")
                fruitTypeOrF = scanner.next()[0]
                when (fruitTypeOrF) {
                    'P' -> {
                        print("How many : ")
                        val howManyP = scanner.nextInt()
                        fruitSale.addSaleItem(FruitRecord.papaya, howManyP)
                    }
                    'W' -> {
                        print("How many : ")
                        val howManyW = scanner.nextInt()
                        fruitSale.addSaleItem(FruitRecord.waterMelon, howManyW)
                    }
                    'G' -> {
                        print("How many : ")
                        val howManyG = scanner.nextInt()
                        fruitSale.addSaleItem(FruitRecord.grape, howManyG)
                    }
                    'A' -> {
                        print("How many : ")
                        val howManyA = scanner.nextInt()
                        fruitSale.addSaleItem(FruitRecord.pineApple, howManyA)
                    }
                    'D' -> {
                        print("How many : ")
                        val howManyD = scanner.nextInt()
                        fruitSale.addSaleItem(FruitRecord.durian, howManyD)
                    }
                }
            } while (fruitTypeOrF != 'F')

            fruitSale.showSaleSummary()
            fruitSales.add(fruitSale)
        }
    } while (dailySummaryOrSale == 'S')

    var totalCountPapaya = 0
    var totalCountWaterMelon = 0
    var totalGrape = 0
    var totalPineApple = 0
    var totalDurian = 0

    for (fruitSale in fruitSales) {
        for (saleItem in fruitSale.saleItems) {
            when (saleItem.fruitType.name) {
                "Papaya (သဘော်သီး)" -> totalCountPapaya += saleItem.quantity
                "Water Melon (ဖရဲသီး)" -> totalCountWaterMelon += saleItem.quantity
                "Grape (စပျစ်သီး)" -> totalGrape += saleItem.quantity
                "Pine Apple (နာနတ်သီး)" -> totalPineApple += saleItem.quantity
                "Durian (ဒူးရင်းသီး)" -> totalDurian += saleItem.quantity
            }
        }
    }

    println("==== Daily Summary ====")
    val subTotalPapaya = totalCountPapaya * FruitRecord.papaya.price
    val subTotalWaterMelon = totalCountWaterMelon * FruitRecord.waterMelon.price
    val subTotalGrape = totalGrape * FruitRecord.grape.price
    val subTotalPineApple = totalPineApple * FruitRecord.pineApple.price
    val subTotalDurian = totalDurian * FruitRecord.durian.price

    val dailyTotal = (subTotalPapaya + subTotalWaterMelon + subTotalGrape
            + subTotalPineApple + subTotalDurian)

    println()
    println("Total Papaya Sale :  $totalCountPapaya ${FruitRecord.papaya.saleUnit} => $subTotalPapaya")
    println("Total Water Melon Sale : $totalCountWaterMelon ${FruitRecord.waterMelon.saleUnit} => $subTotalWaterMelon")
    println("Total Grape Sale : $totalGrape ${FruitRecord.grape.saleUnit} => $subTotalGrape")
    println("Total Pine Apple Sale : $totalPineApple ${FruitRecord.pineApple.saleUnit} => $subTotalPineApple")
    println("Total Durian Sale : $totalDurian ${FruitRecord.durian.saleUnit} => $subTotalDurian")
    println("Daily Total : $dailyTotal mmk")
}