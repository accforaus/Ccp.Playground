/*
Write a function to find the first not repeated character.

function findNotRepeat(str) {
    // body
}

console.log(findNotRepeat('abacddbec')) // output `e`
 */

import java.util.*

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val inputString = reader.nextLine()
        if (inputString == "-1") break

        val result = findNoRepeat(inputString)
        if (result == 0.toChar()) //반복된 단어가 없으면 null 문자를 반환
            println("There is no not-repeated word")
        else println("The first not-repeated character is $result")
    }
}

fun findNoRepeat (input: String) : Char {
    fun checkSame (str: String, target: Char, start: Int) : Boolean {
        if (start > str.length - 1) return true
        for (i in start..(str.length - 1))
            if (str[i].equals(target)) return false
        return true
    }

    val list = BooleanArray(128) //확인한 문자는 다시 확인하지 않음
    for (i in 0..(input.length - 1)) {
        if (list[input[i].toInt()]) continue
        else if (checkSame(input, input[i], i + 1)) return input[i]
        else list[input[i].toInt()] = true
    }
    return 0.toChar()
}

/*
boolean array 를 val 로 선언했는데 왜 각 원소는 mutable 한가요
char 형 null 문자를 어떻게 적나요

string 형에 index를 사용해 접근할 때 예외 처리할 부분이 너무 많아져요..,
 */


