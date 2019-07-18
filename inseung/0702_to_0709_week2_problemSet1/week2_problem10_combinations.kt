/*
Write a function that generates all combinations of a string

function combinations(str) {
    // body
}

console.log(combinations('dog')) // output 'd, do, dog, o, og, g'
 */

import java.util.Scanner

fun main () {
    val reader = Scanner(System.`in`)

    while (true) {
        val input = reader.next()
        if (input == "-1") break //입력이 -1 면 종료

        combination (input)
        print("\n")
    }
}

fun combination (input: String) {
    val size = input.length - 1

    tailrec fun process (input: String) : ArrayList<String> = when (input.length) {
        0 -> arrayListOf<String>("")
        else -> {
            val prev = process(input.drop(1))
            val temp = arrayListOf<String>()
            prev.forEach { temp.add ("${input[0]}$it") }
            temp.addAll(prev)
            temp
        }
    }

    val result = process(input)
    result.sortWith(Comparator { o1, o2 -> o2.length - o1.length })
    print (result.dropLast(1))
}