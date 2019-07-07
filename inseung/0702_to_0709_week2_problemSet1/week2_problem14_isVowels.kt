/*
Write a function hat accepts a string as a parameter and counts the number of vowels within the string

function numOfVowels(str) {
    // body
}


console.log(numOfVowels('The quick brown fox')) // output 5
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val buffer = reader.nextLine()
        if (buffer == "-1") break

        println("The number of vowels in the given string is ${numOfVowels(buffer)}")
    }
}

fun numOfVowels (input: String) : Int {
    fun isVowels (char: Char) : Boolean {
        return when (char) {
            'A' -> true; 'a' -> true; 'E' -> true; 'e' -> true; 'I' -> true; 'i' -> true
            'O' -> true; 'o' -> true; 'U' -> true; 'u' -> true
            else -> false
        }
    }

    var count = 0

    for (i in input)
        if (isVowels(i)) count += 1

    return count
}