/*
Write a function that that accepts a string as a parameter and find the longest word within the string

function longest(str) {
    // body
}

console.log(longest('Web Development Tutorial')) // output `Development`
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val buffer = reader.nextLine()
        if (buffer == "-1") break

        println(longest(buffer))
    }
}

fun longest(input: String) : String {
    var count = 0
    var previousWordlength = 0
    var outputWord: String = ""
    var i = 0
    val size = input.length

    while (i < size) {
        var tempWord: String = ""
        var j = i

        while (!(input[j].equals(' '))){
            tempWord = tempWord.plus("${input[j]}")
            count += 1; j += 1
            if (j >= size - 1) break
        }

        if (count > previousWordlength) {
            outputWord = outputWord.replace(outputWord, tempWord);
            previousWordlength = count
        }

        i = i + count + 1; count = 0;
    }
    return outputWord
}

/*
string type에서 특정 index 에서 index 까지만 복사하고 싶을때는 어떻게 접근하면 좋을까요
단순 for 문 으로..?

while (!(input[j].equals(' '))) 에서 equals(" ") 처럼 "로 공백문자를 처리하면
null 로 인식하더라구요. ' ' 과 " "의 차이는 뭔가요

outputWord = tempWord 로 하면 outputWord 에 tempWord 가 대입이 안되네요 어떻게 하면 좋을까요
 */