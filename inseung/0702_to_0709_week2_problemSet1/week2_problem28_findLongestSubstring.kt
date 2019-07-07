/*
Write a function to find longest substring in a given a string without repeating characters.

function findLongestSubstring(str) {
    // body
}

console.log(findLongestSubstring('google.com')) // output 'gle.com'

console.log(findLongestSubstring('example.com')) // output 'xample.com'
 */

import java.util.*

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val buffer = reader.nextLine()
        if (buffer == "-1") break

        println(findLongestSubstring(buffer))


    }
}

fun findLongestSubstring (str: String) : String {
    var length = 0
    var start = 0; var end = 0

    //중복되지 않는 문자열의 마지막 지점 index를 반환
    fun findEndPoint (str: String, start: Int) : Int {
        val strlength = str.length - 1
        val switch = BooleanArray(128); switch[str[start - 1].toInt()] = true //글자의 중복여부를 저장하는 배열

        if (start > strlength) return strlength //시작지점이 str의 길이보다 클 경우 마지막 인덱스를 return
        for (i in start..strlength) {
            if (switch[str[i].toInt()]) return i - 1
            else switch[str[i].toInt()] = true
        }
        return strlength
    }

    for (i in 0..(str.length - 1)) {
        val tempEnd = findEndPoint(str, i + 1)
        if ((tempEnd - i + 1) > length) {
            length = tempEnd - i + 1
            start = i; end = tempEnd
        }
    }

    return str.substring(start, end + 1) //.substring 은 end - 1 지점까지 자릅니다...
}
