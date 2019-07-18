fun main () {
    println("${extract("thequickbrownfoxjumpsoverthelazydog")}")
}

fun extract (x: String): String {
    var alrdy = arrayOf("")
 
    for (i in 0..x.length-1)

    {
        var b  = x.substring(i,i+1)

        if (b in alrdy)
        {

        }
        else {
            alrdy += b
        }

    }
  return alrdy.joinToString("")

}