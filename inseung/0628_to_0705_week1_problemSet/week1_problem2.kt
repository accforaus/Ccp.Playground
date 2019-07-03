import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)
    var line: Int; var helloNumber: Int //line = 줄 수, helloNumber = HelloWolrd! 출력 수

    while (true) {
        print("입력 : ")
        line = reader.nextInt()
        helloNumber = reader.nextInt()

        if ((line * helloNumber) < 0 ) {
            println("종료합니다!")
            break
        }

        for (i in 1..line) //처음 줄 띄우기
            print("\n")

        for (i in 1..helloNumber) {
            print("$i:"); printSpace(i - 1) //(i -1) 칸 띄우기
            for (j in 1..i) {
                printHello()
            }
            print("\n")
        }
    }
}

fun printHello () {
    print("Hello Wolrd! ")
}

//n + 1개의 공백을 출력
fun printSpace (n: Int) {
    for (i in 0..n) {
        print(" ")
    }
}