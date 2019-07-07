/*
Write a function to extract unique characters from a string.

function extract(str) {
    // body
}

console.log(extract('thequickbrownfoxjumpsoverthelazydog')) // output 'thequickbrownfxjmpsvlazydg' */

import java.lang.StringBuilder
import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val inputString = reader.nextLine()
        if (inputString == "-1") break

        println(extract(inputString))
    }
}

fun extract(input: String) : String {
    val counter = BooleanArray(128)
    val uniqueString = StringBuilder()

    for (i in input) {
        if (!counter[i.toInt()]) {
            counter[i.toInt()] = true
            uniqueString.append(i)
        }
    }

    return uniqueString.toString()
}

/*
uniqueString 을 String 형으로 잡은 다음에
uniqueString.plus("${i}") 하면 왜 uniqueString 에 해당 문자가 들어가지 않을까요..
                 (i) 로 해도 안되요...
 */