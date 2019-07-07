/*
Write a function that returns a passed string with letters in alphabetical older

function order(str) {
    // body
}

console.log(order('webmaster')) // output 'abeemrstw'
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val buffer = reader.next()
        if (buffer == "-1") break

        order(buffer).forEach { print("%c".format(it)) }
        print("\n")
    }
}

fun order(input: String) : IntArray {
    val stringToASCII = arrayListOf<Int>()

    for (i in 0..(input.length - 1))
        stringToASCII.add(input[i].toInt())
    stringToASCII.sort()

    return stringToASCII.toIntArray()
}