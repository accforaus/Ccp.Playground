import java.util.Scanner

fun main(args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while(true) {
        print("입력 :")
        val input: Int = reader.nextInt()

        if (input < 5 ) {
            println("5보다 큰 값을 입력하셔야 합니다!")
            continue
        }
        if (input <= 0 ) {
            println("종료합니다!")
            break
        }

        print("1: "); for (i in 1..input) print("*"); print("\n") //첫 줄 출력
        for (i in 1..(input - 2)) {
            print("${i + 1}: "); printSpace(i); print("*"); printSpace(input - i - 2); println("*")
        }
        print("$input: "); printSpace(input - 1); println("*")
    }
}

fun printSpace (n: Int) {
    for (i in 0..(n - 1)) {
        print(" ")
    }
}