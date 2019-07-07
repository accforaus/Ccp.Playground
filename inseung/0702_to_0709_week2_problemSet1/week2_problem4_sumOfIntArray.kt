/*
Write a program to compute the sum of an array of integers

function sum(array) {
    // body
}

console.log(sum([1, 2, 3, 4, 5, 6])) // output 21
}

console.log(fibonacci(8)) // output 21
 */

import java.util.Scanner
import kotlin.test.assertTrue

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val numbers = arrayListOf<Int>()
        while (true) {
            val input = reader.next()
            if (input.equals("x")) break
            numbers.add(input.toInt())
        }

        println("The Sum of given array is ${sum(numbers)}")

    }
}

fun sum (inputArray: ArrayList<Int>) : Int {
    var sum = 0
    for (i in inputArray) sum += i
    return sum
}

/*
List 형과 array 형의 차이가 뭔가요
array 형에서는 .add 처럼 size를 유동적을 바꿀 수 없나요?
 */