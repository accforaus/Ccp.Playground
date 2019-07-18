
fun main () {
    println("${findNotRepeat("abacddbec")}")
}


fun findNotRepeat(x: String) : Char{

    var result = 'a'
    for (i in 0..x.length-1)
    {
        var a = x.substring(i+1, x.length-1)

        if( a.indexOf(x[i]) < 0 && charCount(x, x[i])==1)
        {

            result = x[i]
            break

        }



    }
    return result
}

