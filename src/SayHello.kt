class SayHello(val name:String) {

    fun sayHello() {
        println("Hello, $name")
    }
}

fun main(args:Array<String>) {
    SayHello("Ko Aung Pyae").sayHello()
}
