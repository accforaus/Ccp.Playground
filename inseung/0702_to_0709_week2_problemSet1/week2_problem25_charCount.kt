/*
Write a function that accepts two arguments, a string and a letter and the function will count the number of occurrences of the specified letter within the string.

function charCount(str, ch) {
    // body
}

console.log(charCount('ourhours.com', 'o')) // output 3 

 */

import java.util.*

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val inputString = reader.nextLine()
        val reference = reader.next()

        println("$reference occurs ${charCount(inputString, reference[0].toChar())} times in the given string")
    }
}

fun charCount (str: String, ch: Char) : Int {
    var counter = 0

    for (i in str)
        if (i.equals(ch)) counter += 1

    return counter
}