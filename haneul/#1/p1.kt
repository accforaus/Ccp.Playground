import java.util.Scanner

fun main() {
//    구구단
    val sc: Scanner = Scanner(System.`in`)
    println("구구단 출력 프로그램입니다.")
    println("시작단을 입력하세요: ")
    var start = sc.nextInt()

    println("마지막단을 입력하세요: ")
    var end = sc.nextInt()

    for (x in start..end)
        for (y in 1..9)
            println("$x * $y = ${x * y}")
}