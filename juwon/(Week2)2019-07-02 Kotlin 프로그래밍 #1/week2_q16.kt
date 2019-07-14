import java.lang.Character.getType
import java.lang.Double.parseDouble


fun main () {
    val a= "hr"
    val b = 1
    println("${getType("1")}")
    println("${b::class.qualifiedName}")
   println("${a::class.qualifiedName}")
   println("${getType("()")}")
   println("${getType("[]")}")
}

fun getType (x: String) : String{
    var a = ""
    var b = isNumeric(x)

    if (x == "[]") a = "object"

    else if (b== true)
    {
        //println(b)
        a = "number"
    }

    else { a="undefined"}


   return a
}

fun isNumeric(x: String) : Any? {
    var numeric = true
    try {
        val num = parseDouble(x)

    } catch (e: NumberFormatException) {
        numeric = false
    }

    return numeric
}