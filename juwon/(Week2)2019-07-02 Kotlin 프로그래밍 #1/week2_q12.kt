fun main() {
    println(toUpper("the quick brown fox"))
}

fun toUpper(x: String) : String {
    var list = x.split(" ")
    var cap: String =""
    for (word in list) {
        cap = cap + word.capitalize() + " "
    }
    return cap
}