/*
Write a function that returns the longest palindrome in a given string.

function findLongestPalindrome(str) {
    // body
}

console.log(findLongestPalindrome("abracadabra")) // output `aca`
console.log(findLongestPalindrome("HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE")) // output `12345 */

import java.util.*

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val buffer = reader.nextLine()
        if (buffer == "-1") break

        val result = findLongestPalindrome(buffer)

        if (result.length == 1) println("There is no proper palindrome in the given string")
        else println(result)
    }
}

fun findLongestPalindrome(str: String) : String {
    var length = 0
    var start = 0; var end = 0
    val strlength = str.length - 1

    fun findSubPalindrome (str: String, start: Int, strlength: Int) : Int {
        var i = 0
        while (true) {
            if ((start + i) > strlength || (start - i) < 0) return i - 1
            else if (str[start + i] != str[start - i]) return i - 1
            else i += 1
        }
    }

    for (i in 1..strlength) {
        val tempEnd = findSubPalindrome(str, i, strlength)
        if (tempEnd > length) {
            length = tempEnd
            start = i - tempEnd; end = i + tempEnd
        }
    }

    return str.substring(start, end + 1)
}








