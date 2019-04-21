package calculator

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Enter 1st operand : ")
    val firstOperand = scanner.nextLine()
    print("Enter operator : ")
    val operator = scanner.nextLine()
    print("Enter 2nd operand : ")
    val secondOperand = scanner.nextLine()

    when (operator) {
        "+" -> println("Result : ${operationPlus(firstOperand, secondOperand)}")
        "-" -> println("Result : ${operationMinus(firstOperand, secondOperand)}")
        "*" -> println("Result : ${operationMultiply(firstOperand, secondOperand)}")
        "/" -> println("Result : ${operationDivision(firstOperand, secondOperand)}")
    }
}

fun operationPlus(firstOperand: String, secondOperand: String): Double {
    return firstOperand.toDouble() + secondOperand.toDouble()
}

fun operationMinus(firstOperand: String, secondOperand: String): Double {
    return firstOperand.toDouble() - secondOperand.toDouble()
}

fun operationMultiply(firstOperand: String, secondOperand: String): Double {
    return firstOperand.toDouble() * secondOperand.toDouble()
}

fun operationDivision(firstOperand: String, secondOperand: String): Double {
    return firstOperand.toDouble() / secondOperand.toDouble()
}
