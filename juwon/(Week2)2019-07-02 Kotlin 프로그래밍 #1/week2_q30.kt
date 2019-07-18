fun main() {

    f2(::f)
}

fun f() {
    println("Hello world")
}

fun f2(x: () -> Unit) {
    x()
}