/*
Write a program to check whether a number is even or not

function isEven(num) {
    //body
}

}

console.log(fibonacci(8)) // output 21
 */

import java.util.Scanner
import kotlin.test.assertTrue

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val input = reader.nextInt()
        if (input < 0) break

        if (isEven(input)) println("$input is Even")
        else println("$input is Odd")
    }
}

fun isEven (num: Int) : Boolean = if (num % 2 == 0) true else false

