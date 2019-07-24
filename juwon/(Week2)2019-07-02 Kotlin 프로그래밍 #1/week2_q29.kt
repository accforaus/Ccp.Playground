import jdk.nashorn.internal.objects.NativeString.charAt

fun main() {
    println(findLongestPalindrome("abracadabra"))
    println(findLongestPalindrome("HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE"))

}
fun findLongestPalindrome(x: String): String {
    var count = 0
    var saved = ""



    for (i in 1..x.length - 1) {


    for (j in 1..i)
        if (i - j >= 0 && i + j <= x.length - 1 && x.get(i - j) == x.get(i + j)) {




                if (j > count) {
                    count = j


                    saved = x.substring(i - j, i + j + 1)

                }

            }
        else break



        }



    return saved

}