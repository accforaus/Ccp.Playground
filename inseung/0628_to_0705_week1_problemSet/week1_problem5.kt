import java.util.Scanner

fun main(args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        print("입력 : ")
        val input: Int = reader.nextInt()

        if (input <= 0) {
            println("종료합니다!")
            break
        }
        if ((input % 2) == 0) {
            println("짝수입니다! 다시 입력하세요!")
            continue
        }

        val half: Int = (input - 1) / 2 //첫 번째 줄에서 *의 위치 -1

        printSpace(half - 1); println("*") //첫 번째 줄 출력
        for (i in 1..(input - 2)) {
            printSpace(abs(half - i)); print("*")
            printSpace(2 * (half - abs(i - half)) - 1); println("*")
            /* Ex) input = 5 인 경우 *사이의 공백은 1 3 5 3 1 이고 n 번째 홀수로서 보면
            1 2 3 2 1 이므로 y = c - |x - c| 형태의 함수임을 알 수 있다.
             */
        }
        printSpace(half - 1); println("*") //마지막 줄 출력

    }
}

fun printSpace (n: Int) {
    for (i in 0..(n - 1)) {
    print(" ")
}
}

//get Absolute value of input number
fun abs(a: Int) : Int {
    return if (a < 0) {
        (-1) * a
    }
    else if (a > 0) {
        a
    }
    else 0
}