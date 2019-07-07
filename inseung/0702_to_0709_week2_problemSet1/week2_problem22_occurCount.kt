/*
Write a function to get the number of occurrences of each letter in specified string.

function occurCount(str) {
    // body
}

console.log(occurCount("The quick brown fox jumps over the lazy dog")) // output{"T":1,"h":2,"e":3,"q":1,"u":2

 */
import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val inputString = reader.nextLine()
        if (inputString == "-1") break

        val result = occurCount(inputString)
        val switch = BooleanArray(128)

        for (i in inputString) {
            if (!switch[i.toInt()] && !(i.equals(' '))) {
                switch[i.toInt()] = true
                print ("\"$i\" : ${result[i.toInt()]} ")
            }
        }
    }
}

fun occurCount(input: String) : IntArray {
    val counter = IntArray(128) {i -> 0}

    for (i in input)
        counter[i.toInt()] += 1

    return counter
}

/*
uniqueString 을 String 형으로 잡은 다음에
uniqueString.plus("${i}") 하면 왜 uniqueString 에 해당 문자가 들어가지 않을까요..
                 (i) 로 해도 안되요...

만약
for (i in inputString) {
            if (!switch[i.toInt()] && !(i.equals(' '))) {
                switch[i.toInt()] = true
                print ("\"$i\" : ${result[i.toInt()]} ")
            }
        }
에서 result 배열을 만들지 않고 extract.[i.toInt()] 처럼 바로 함수의 return 값을
참조하면 extract 함수는 for loop에서 여러번 호출되는 건가요? 아니면 한번 호출된 값이
어딘가에 저장되있고 마치 변수처럼 움직이게 되는가요

문자를 아스키 코드 말고 다르게 다루는 방법은 없나요??
 */