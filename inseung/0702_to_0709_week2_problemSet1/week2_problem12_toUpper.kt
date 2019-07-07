/*
Write a function that accepts a string as a parameter and converts the first letter of each word of the string in upper case

function toUpper(str) {
    // body
}

console.log(toUpper('the quick brown fox')) // output 'The Quick Brown Fox'
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val buffer = reader.nextLine()
        if (buffer == "-1") break

        toUpper(buffer).forEach { print("%c".format(it)) }
        print("\n")
    }
}

fun toUpper(input: String) : IntArray {
    val stringToASCII = arrayListOf<Int>()

    //대문자이면 그대로, 소문자면 대문자로...
    fun isUpper(num: Int) : Int = if (num >= 97 && num <= 122) num - 32 else num

    for (i in 0..(input.length - 1))
        stringToASCII.add(input[i].toInt())

    stringToASCII[0] = isUpper(stringToASCII[0]) //첫단어 대문자로 바꾸기
    for (i in 1..(stringToASCII.size)) {
        if (stringToASCII[i - 1] == 32)
            stringToASCII[i] = isUpper(stringToASCII[i])
    }

    return stringToASCII.toIntArray()
}
/*
toUpper 에 input: String 을 입력으로 주고 input[0] = ~~~ 이런식으로 접근해 수정할 수 없다고 하네요.
왜인가요..??
 */