/*
Write a function that generates all combinations of a string

function combinations(str) {
    // body
}

console.log(combinations('dog')) // output 'd, do, dog, o, og, g'
 */

import java.util.Scanner
import kotlin.test.assertTrue

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val input = reader.next()
        if (input == "-1") break //입력이 -1 면 종료

        combination (input)

    }
}

fun combination (input: String) {
    val size = input.length - 1

    fun printString(input: String, start:Int, end: Int) {
        for (i in start..end) print(input[i])
    }

    for (i in 0..size) {
        for (j in i..size) {
            printString(input, i, j)
            if (i == size) print("\n") else print(", ")
        }
    }
}