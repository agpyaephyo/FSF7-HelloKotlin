package say

fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4, 5)

    val totalResult = items.fold(0, { acc: Int, i: Int ->
        print("acc = $acc, i = $i - ")
        val result = acc + i
        println("result = $result")
        result
    })
    println("totalResult : $totalResult")
    println()

    val joinedString = items.fold("Elements : ", { acc, i ->
        println("$acc + $i")
        "$acc + $i"
    })
    println("joinedString : $joinedString")
    println()

    val product = items.fold(1, Int::times)
    println("product : $product")

    loopIt { println("hello") }
}

fun loopIt(start: Int = 0, finish: Int = 10, execute: () -> Unit) {
    for (index in start..finish) {
        execute.invoke()
    }
}