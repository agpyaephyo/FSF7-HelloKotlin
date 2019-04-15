package types

fun main(args: Array<String>) {
    //Variable declaration, assignment & accessing.
    val intConstant: Int
    intConstant = 100
    println("intConstant : $intConstant")

    //Assigning a value to a variable.
    val floatConstant: Float = 10.5f
    println("floatConstant : $floatConstant")

    //Inferred Type
    val doubleConstant = 12.34
    //doubleConstant = 13.45
    println("doubleConstant : $doubleConstant")

    //Inferred Type with Long Literal
    var longVariable = 12500L
    longVariable = 16_000_000L //underscored between numbers to be more readable.
    println("doubleConstant : $longVariable")

    //value declarations for Char type & Boolean type.
    val myChar: Char = 'C'
    val isTrue: Boolean = true

    //String value declaration
    val myName = "John Doe"
    //myName = "Michael"
    println("myName : $myName")

    //String optional type
    val className: String
    //className = "PADC"
    //val className : String = null
    //val className : String? = null
    //println("className : $className")

    //Explicit conversion to bigger type.
    //val myLong : Long = intConstant

    //Arrays
    val intArray = arrayOf(1, 2, 3)
    //val intArray : Array<Int> = arrayOf(1, 2, 3)

    val doubleArray = arrayOf(1.2, 2.3, 3.4, 5)
    //val doubleArray : Array<Any> = arrayOf(1.2, 2.3, 3.4, 5)
    //val doubleArray : Array<Double> = arrayOf(1.2, 2.3, 3.4, 5.0)

    println("intArray : ${intArray.size}")
    println("doubleArray : ${doubleArray.size}")

    println("intArray[2] : ${intArray[2]}")
    println("doubleArray[0] : ${doubleArray[0]}")

    intArray[2] = 89
    println("intArray[2] : ${intArray[2]}")

    //intArray = arrayOf(4, 5, 6)

    println()
    val asc = Array(5) { i -> (i * i) }
    asc.forEach { println("Number : $it") }

    val intPrimitiveArray: IntArray = intArrayOf(23, 34, 45, 56)
}