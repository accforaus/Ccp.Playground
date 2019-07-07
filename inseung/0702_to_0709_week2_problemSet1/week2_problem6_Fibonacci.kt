/*
Write a program to get the first n Fibonacci numbers

function fibonacci(num) {
    //body
}

console.log(fibonacci(8)) // output 21
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val input = reader.nextInt()
        if (input < 0) break

        println("nth Fibonacci number is ${fibonacci(input)}")
    }
}

fun fibonacci (n: Int) : Int {
    var f1: Int = 0
    var f2: Int = 1

    for (i in 1..(n - 1)) {
        val temp = f2
        f2 = f1 + f2
        f1 = temp
    }

    return f2
}

