import java.util.Scanner

fun main(args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)
    var sum: Int = 0
    var multiply: Int = 1
    var counter: Int = 0 // sum = 합계, mul = 곱
    var input : Int

    while(true) {
        while (true) { //입력갑 받는 부분
            print("입력 : ")
            input = reader.nextInt()
            if (input <= 0) break;
            sum = sum + input
            multiply = multiply * input
            counter++
        }

        if (input < 0) {
            println("종료합니다!")
            break
        }

        val average = sum / counter
        val score = when (average) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }

        println("합결과 : $sum 곱셈결과 : $multiply")
        println("평균 : $average 학점 : $score")
    }
}

