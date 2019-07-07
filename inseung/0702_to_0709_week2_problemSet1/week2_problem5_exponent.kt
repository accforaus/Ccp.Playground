/*
Write a program to compute the exponent of a number

Note: The exponent of a number says how many times the base number is used as a factor

function exponent(num) {
    // body
}

console.log(exponent(64)) // output 2

 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val input: Int = reader.nextInt()
        if (input < 0) break

        exponent(input)
        print("\n")
    }
}

fun exponent (num: Int) {

    fun isFactor (num: Int, base: Int) : Boolean {
        return if ((num % base) > 0)  false
        else if ((num / base) == 1)  true
        else isFactor(num / base, base)
    }

    var counter: Boolean = true
    for (i in 2..(num - 1))
        if (isFactor(num, i)) { print("$i "); counter = false; break }
    if (counter) print("$num is not a power of any bases")
}



/*
base 도 입력으로 받아야 될 듯한데 문제 뜻을 모르겠네요
일단 제곱수인지 판단하는 형식으로 만들었어요

가장 작은 base를 찾도록 수정함
 */
