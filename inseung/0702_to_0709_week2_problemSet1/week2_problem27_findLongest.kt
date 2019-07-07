/*
Write a function that accept a list of country names as input and returns the longest country name as output.

function findLongest(arr) {
    // body
}

console.log(findLongest(['Australia', 'Germany', 'Korea', 'United States of America'])) // output 'United States of America'
 */

import java.util.*

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val name = mutableListOf<String>()
        while (true) {
            val buffer = reader.nextLine()
            if (buffer == "-1") break
            name.add(buffer)
        }
        if (name.isEmpty()) break

        println("The longest country name is ${findLongest(name)}")
    }
}

fun findLongest (name: List<String>) : String {
    var previousLength = 0
    var index = 0
    var outputIndex = 0

    for (i in name) {
        if (i.length > previousLength) {
            previousLength = i.length
            outputIndex = index
        }
        index += 1
    }

    return name[outputIndex]
}




