package operations

fun main(args: Array<String>) {

    //val myAge = Integer.parseInt(args[0]) //68
    val myAge = 68
    val pi = 3.142

    //Arithmetic Operations
    val myWealth = myAge * pi
    println("myWealth : $myWealth")

    val dailySpending = myWealth % 4800
    println("dailySpending : $dailySpending")

    //Relational Operations
    println("isDailySpendingTooMuch : " + (dailySpending > myWealth))
    println("isTooOld : " + (myAge == 75))
    println("notAKidAnymore : " + (myAge > 21))

    //Logical Operations
    println("stillHaveChance : " + (myAge > 18 && myAge < 45))

    //Range Operations
    println("Range Check 1 : " + (myAge in 18..45))
    println("Range Check 2 : " + (myAge !in 49..75))
    println("Range Check 3 : " + (myAge in 75 downTo 46))
    println("Range Check 3 : " + (myAge in 46 .. 75))
}