/*
Write a program to find the greatest common divisor (GCD) of two positive numbers

function GCD(num1, num2) {
    //body
}

console.log(GCD(380, 500)) // output 20
console.log(GCD(50, 30)) // output 10
console.log(GCD(3949350, 4693496)) // output 2
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val num1 = reader.nextInt()
        val num2 = reader.nextInt()
        if ((num1 < 0 ) || (num2 < 0)) break

        println(GCD(Max(num1, num2), Min(num1, num2)))
    }
}

fun GCD(a: Int, b: Int) : Int = if ((a % b) == 0) b else GCD(b, a % b)

fun Max(a: Int, b: Int) : Int = if (a > b) a else b

fun Min(a: Int, b: Int) : Int = if (a < b) a else b