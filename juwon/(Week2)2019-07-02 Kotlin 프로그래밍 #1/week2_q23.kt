


fun main() {
    var q = listOf<Int>(11, 45, 4, 31, 64, 10)

    println("${biggerElements(q)}")


}

fun biggerElements(x: List<Int>): List<Int> {
    var min : Int = x.min()!!

    return x.filter{it > min}


   
}

