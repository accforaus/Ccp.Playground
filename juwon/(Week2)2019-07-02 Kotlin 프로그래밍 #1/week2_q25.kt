fun main() {
    println("${charCount("ourhours.com", 'o')}")

}

fun charCount(from: String, find: Char): Int {
    var a = 0
    for (i in 0..from.length-1)
    {
        if( from[i]==find)
            a++
    }

    return a
}
