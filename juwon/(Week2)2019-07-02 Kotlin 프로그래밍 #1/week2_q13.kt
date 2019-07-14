

import java.util.*

fun main(args: Array<String>) {
    val a = longest("Web Development Tutorial")
    println(a)
    // getString()
}

fun longest (x: String): String {
    var words = x.split(" ")
    //println(words)
    var result = words[0]
   // println(result)
    var a = words[0].length
    //var b = result.length
   // println(a)
   // println(b)


    // for (i in words)
    for (i in 1..a-1)
    {
     //   println(i)
        if (result.length < words[i].length)
        {
            result=words[i]
            //println(result)
        }
        //len = i.length

    }
    return result
}