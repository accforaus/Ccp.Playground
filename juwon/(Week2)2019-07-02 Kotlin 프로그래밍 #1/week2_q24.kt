import java.util.Random


fun main() {
    println("${makeId(8)}")
}

fun makeId(x: Int) : String {
    val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val charList = letters.split("")
    return charList.shuffled().take(x).joinToString("")


}