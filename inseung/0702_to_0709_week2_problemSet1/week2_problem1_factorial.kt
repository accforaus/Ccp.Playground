/*
Write a program to calculate the factorial of a number

function factorial(num) {
    // body
}

console.log(factorial(5)) // output 120
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val num = reader.nextInt()
        if (num < 0 ) break

        println(factorial(num))
    }
}

fun factorial(num: Int) : Int {
    var result: Int = 1
    for (i in 1..num)
        result *= i
    return result
}