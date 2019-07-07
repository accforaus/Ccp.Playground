/*
Write a function that reverse a number

function reverse(num) {
    // body
}

console.log(reverse(32243)) // output 34223
 */

import java.util.Scanner
import kotlin.test.assertTrue

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val input = reader.nextInt()
        if (input < 0) break

        reverse (input); print("\n")
    }
}

fun reverse (num: Int) {
    return if ((num / 10) < 1) print("$num")
    else {
        print("${num % 10}")
        reverse (num / 10)
    }
}
