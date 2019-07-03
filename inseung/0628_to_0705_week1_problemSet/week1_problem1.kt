import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`) //입력을 위한 Scanner 객채 생성

    println("구구단 출력 프로그램입니다.\n시작단을 입력하세요 : ")
    val start: Int = reader.nextInt()
    println("마지막단을 입력하세요 : ")
    val end: Int = reader.nextInt()

    for (i in start..end) {
       for (j in 1..9) {
           println("$i x $j = ${i * j}")
       }
   }
}