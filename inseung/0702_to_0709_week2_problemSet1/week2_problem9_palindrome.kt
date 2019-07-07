/*
Write a function that checks whether a passed string is palindrome or not?

function palindrome(str) {
    // body
}

console.log(palindrome('토마토')) // true
console.log(palindrome('비글왈!')) // false
 */

import java.util.Scanner
import kotlin.test.assertTrue

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val input = reader.next()
        if (input == "-1") break //입력이 -1 면 종료

        if (palindrome(input)) println("The given string is Palindrome")
        else println("The given string is not Palindrome")

    }
}

fun palindrome (input: String) : Boolean {
    val size = input.length - 1
    for (i in 0..(size / 2)) //문자열의 절반까지만 확인
        if (input[i] != input[size - i]) return false
    return true
}
