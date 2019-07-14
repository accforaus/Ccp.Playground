fun main() {

    println("${exp(2,3)}")
}

fun exp (x: Int, y: Int) : Double {
    var result = 1

    for (i in 1..y)
    {
        result *= x
    }

    return result.toDouble()
}
