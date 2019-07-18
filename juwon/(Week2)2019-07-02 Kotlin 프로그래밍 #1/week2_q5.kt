fun main() {
    println("${exponent(64, 8)}")
}

fun exponent(x2: Int, y2: Int): Int {
    var x = x2
    var y = y2
    var howMany = 0

    while (x >1)
    {
        x= x/y
        howMany++

    }

    return howMany

}