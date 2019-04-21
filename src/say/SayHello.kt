package say

//class with attribute
class SayHello(var name: String, var address: String = "Yangon", age: Int = 18) {

    var age: Int = 0
        set(value) {
            if (value > 0)
                field = value
        }

    init {
        this.age = age
    }

    fun sayHello() {
        println("Hello, $name") //accessing attribute from member function & string concatenating.
    }

    fun show(argument: String) { //method with String parameter
        println("This is what you give : $argument")
    }
}

fun main(args: Array<String>) {
    val objSayHello = SayHello("Ko Aung Pyae") //obj instantiation
    objSayHello.sayHello() //invoking the member function
    objSayHello.show(args[0]) //passing the program argument

    objSayHello.age = 120
    println("Age : ${objSayHello.age}")
}
