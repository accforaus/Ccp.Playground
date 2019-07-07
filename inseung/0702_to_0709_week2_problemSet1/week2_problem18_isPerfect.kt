/*
Write a function which says whether a number is perfect.

function findPerfectNumberByRange(x, y) {
    // body
}

console.log(findPerfectNumberByRange(1, 500)) // output '6, 28, 496'
 */

import java.util.Scanner
import kotlin.test.assertTrue

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        var start: Int = reader.nextInt()
        var end: Int = reader.nextInt()
        if (start < 0 || end < 0) break

        if (start == 1) start += 1 // we consdier 1 is not a perfect number
        if (start > end) {
            val temp = start
            start = end; end = temp
        }

        for (i in start..end) {
            if (isPerfect(i)) print("$i ")
        }
        print("\n")
    }
}

fun isPerfect (n: Int) : Boolean {
    var sigma = 0 //sum of all divisor of n

    for (i in 1..n) {
        if ((i * i) > n) break
        if ((n % i) == 0) {
            if ((n / i) == i) sigma += i
            else sigma += i + n / i
        }
    }

    return if (sigma == (2 * n)) true else false
}
