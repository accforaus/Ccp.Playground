/*
Write a function which will take an array of numbers stored and find the second lowest and second greatest numbers, respectively.

function find(array) {
    // body
}

console.log(find([1, 2, 3, 4, 5])) // output '2, 4'
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val numArray = arrayListOf<Int>()

        while (true) {
            val buffer = reader.next()
            if (buffer == "x") break
            numArray.add(buffer.toInt())
        }
        if (numArray.isEmpty()) break

        println("${find(numArray.toIntArray())[0]}  ${find(numArray.toIntArray())[1]}")
    }
}

fun find (input: IntArray) : IntArray {
    input.sort()
    val output = intArrayOf(input[1], input[input.size - 2])

    return output
}


