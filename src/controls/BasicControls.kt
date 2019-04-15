package controls

import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    val intOne = 64
    val intTwo = 128
    var yourInt = parseInt(args[0])

    if (yourInt > intOne) {
        println("Better than 64. Good.")
    } else {
        println("Should be at least 64.")
    }

    if (intTwo is Int) {
        println("intTwo is an integer.")
    }
    //!is

    var intMaxOne: Int
    if (intOne > intTwo) {
        intMaxOne = intOne
    } else {
        intMaxOne = intTwo
    }

    //"else" is required when "if" is being used as an expression
    intMaxOne = if (intOne > intTwo) {
        intOne
    } else {
        intTwo
    }

    val intMaxTwo = if (intOne > intTwo) intOne else intTwo

    when (yourInt) {
        4 -> println("legacy.")
        16 -> println("very old.")
        32 -> println("before dot com boom.")
        64 -> println("not too bad")
        128 -> println("ok")
        256, 512 -> println("great")
        in 513..1024 -> println("awesome")
        else -> {
            println("outlier")
            yourInt = 256
            println("updated to $yourInt")
        }
    }

    //Using "when" in the place of if-else-if.
    when {
        yourInt > intOne -> println("Better than 64. Good.")
        else -> println("Should be at least 64.")
    }

    val intArray = arrayOf(12, 23, 34, 45, 56, 67, 78, 89, 90)
    for (int in intArray) {
        println("intArray : $int")
    }

    //iterating through a range of numbers
    for (int in 1..10) {
        println("For Loop with Range : $int")
    }

    for (int in 1..10 step 3) {
        println("Range & step: $int")
    }

    for (int in 6 downTo 0) {
        println("downTo Loop : $int")
    }

    for (int in 6 downTo 0 step 2) {
        println("downTo with Step : $int")
    }

    //iterating the collection with index
    for (int in intArray.indices) {
        println("intArray with indices: ${intArray[int]}")
    }

    for ((index, value) in intArray.withIndex()) {
        println("intArray with withIndex: $value at $index")
    }

    while (intArray[3] > 0) {
        println("intArray with while : ${--intArray[3]}")
    }
}