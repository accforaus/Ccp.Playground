
fun main(args: Array<String>) {

    println("${occurCount("the quick brown fox jumps over the lazy dog")}")
}



fun occurCount(x: String): Map<String, Int> {
    var each = x.split("")


    var result = each.groupingBy{it}.eachCount()


    return result

}


