fun main() {
    println("${numOfVowels("The quick brown fox")}")
}

fun numOfVowels(x: String) : Int {

    var count : Int = 0
    var vowel= "aeiouAEIOU"
    var a = x.length
    for (i in 0..a-1)

    {
        if (x[i] == 'a' || x[i] == 'e' ||x[i] == 'i' ||x[i] == 'o' ||
            x[i] == 'u' || x[i] == 'A' || x[i] == 'E' ||x[i] == 'I' ||x[i] == 'O' ||
            x[i] == 'U')
         count++
    }

    return count
}