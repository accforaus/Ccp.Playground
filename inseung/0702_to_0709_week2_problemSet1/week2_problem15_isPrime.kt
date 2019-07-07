/*
Write a function accepts a number as a parameter and check the number is prime or not

function isFrime(num) {
    // body
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

        if (isPrime(input)) println("$input is Prime")
        else println("$input is not Prime")
    }
}

fun isPrime (n: Int) : Boolean {
    for (i in 2..(n - 1)) {
        if ((i * i) > n) break
        if ((n % i) == 0) return false
    }
    return true
}