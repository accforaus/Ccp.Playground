/*
Write a function to compute the value of b^n where n is the exponent and b is the bases. Accept b and n from the user display the result.

function exp(b, n) {
    // body
}
console.log(exp(2, 3)) // 8'
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val base = reader.nextInt()
        val exponent = reader.nextInt()
        if (base <= 0 || exponent <= 0) break

        println(exp(base, exponent))
    }
}

fun exp(b: Int, n: Int) : Int {
    var result = 1
    for (i in 1..n)
        result *= b

    return result
}