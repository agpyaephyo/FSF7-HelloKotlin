package say

fun main(args: Array<String>) {
    val text = separateHi("How are you ?")
    println(text)
    //println(separateHi(args[0]))
    //SayHi().hi()

    println(doTheMath(numOne = 42, numTwo = 53))
    println(doTheMath(34)) //default argument
    doTheMath()

    println(doTheMath(numTwo = 123, numOne = 456)) //named argument

    val items = intArrayOf(1, 2, 3, 4, 5)
    withVarArgs(12, 23, 34, *items, 67) //variable argument

    val sayHi = SayHi()
    sayHi.hi()
    val double = sayHi callThis 43
    println("double = $double")
}

fun separateHi(sayWhat: String): String {
    return "$sayWhat, me too."
}

class SayHi {
    fun hi() {
        println("Hi, Kotlin")
    }

    infix fun callThis(x: Int): Int {
        return x * x
    }
}

fun doTheMath(numOne: Int = 24, numTwo: Int = 12): Int {
    return numOne * numTwo
}

fun withVarArgs(vararg nums: Int) {
    var total = 0
    for (num in nums) {
        total += num
    }
    println("withVarArgs : $total")
}