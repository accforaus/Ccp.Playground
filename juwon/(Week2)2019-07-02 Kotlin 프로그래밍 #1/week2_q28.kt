fun main (args: Array<String>) {
    println(findLongestSubstring("google.com"))
    println(findLongestSubstring("example.com"))
}

fun findLongestSubstring(x: String): String {
   var alrdy : List<Any> = listOf()

    for (i in 0..x.length-1)
    {
        if ( x[i] in alrdy )
        {

        }
        else alrdy = alrdy + x[i]
    }

    return alrdy.joinToString("")
}
