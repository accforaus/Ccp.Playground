/*
Write a program to get the integers in range (x, y)

function range(x, y) {
    // body
}

console.log(range(2, 9)) // output [3, 4, 5, 6, 7, 8]
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        var a: Int = reader.nextInt()
        var b: Int = reader.nextInt()

        if ((a < 0) || (b < 0)) break

        if (a > b) { // a > b 인 경우 a와 b 교환
            val temp: Int = a
            a = b; b = temp
        }

        val arrayOfab = range(a, b)

        arrayOfab.forEach { print("$it ") }; print("\n")

    }
}

fun range (x: Int, y: Int) = IntArray(y - x - 1, {i -> i + x + 1})


/*
    함수range의 return값의 data type을 array로 할 수 없나요?

 */