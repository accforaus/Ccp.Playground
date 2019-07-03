import java.util.Scanner

fun main(args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)
    var meet: Int; var jisoo: Int // meet = 밑, jisoo = 지수

    while(true) {
        print("입력 : ")
        meet = reader.nextInt()
        jisoo = reader.nextInt()

        if (meet == 0 && jisoo == 0) {
            println("종료합니다!")
            break
        }

        for (i in 1..jisoo) {
            print("$i:"); printSpace(i - 1) //(i -1) 칸 띄우기
            print(" = ${printEquation(meet, i, 1)} \n")
        }
    }
}

fun printSpace (n: Int) {
    for (i in 0..n) {
        print(" ")
    }
}

fun printEquation (meet: Int, stage: Int, result: Int) : Int {
    return if (stage <= 0) {
        result
    }
    else {
        if (stage == 1) {print("$meet")}
        else {
            print("$meet * ")
        }
        printEquation (meet, stage - 1, result * meet)
    }
}

/* 왜 재귀함수를 C언어처럼 구현하면 안될까요... 저렇게 브라켓 안에
리턴값을 넣어줘야 실행이 되더라구요...
fun printEquation (meet: Int, stage: Int, result: Int) : Int {
    if (stage <= 0) {
       return result
    }
    if (stage == 1) {print("$meet")}
    else {print("$meet * ")}
    printEquation (meet, stage - 1, result * meet)
}
 */