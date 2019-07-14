
fun main() {
    println("${palindrome("토마토")}")
    println("${palindrome("비글왈!")}")

}

fun palindrome(x: String) : Boolean {
    var rvsd =""
    val length = x.length-1


    for (i in 0..length) {
        //rvsd = "$rvsd${x.get(length-1-i)}"
     //   rvsd = "${x.get(length-i)}"
        rvsd = rvsd + x.get(length-i)
       // println(rvsd)

    }
 //   println(rvsd)
    return x == rvsd


}


fun abc() {
    println("$")
}