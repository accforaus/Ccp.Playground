fun main() {
    println("${order("webmaster")}")
}

fun order( x: String) : String{
    var alpha = x.toCharArray()
    return alpha.sorted().joinToString("")
}


