/*
Write a function that returns array elements larger than a number.

function biggerElements(val) {
    // body
}

console.log(biggerElements([11, 45, 4, 31, 64, 10])) // output [11, 45, 31, 64, 10]

 */
import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val reference = reader.nextInt()
        val inputArray = arrayListOf<Int>()

        while (true) {
            val buffer = reader.next()
            if (buffer.equals("x")) break
            inputArray.add(buffer.toInt())
        }

        biggerElements(reference, inputArray.toIntArray()).forEach { print("$it ") }
        print("\n")
    }
}

fun biggerElements (ref: Int, array: IntArray) : IntArray {
    val result = arrayListOf<Int>()
    for (i in array) {
        if (i > ref) result.add(i)
    }

    return result.toIntArray()
}