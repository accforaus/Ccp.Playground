import java.util.Scanner
import kotlin.math.sqrt

fun main (agrs: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)
    var x: IntArray = intArrayOf(0, 0)
    var y: IntArray = intArrayOf(0, 0)

    while (true) {
        print("왼쪽 윗점(x1,y1) : ")
        x[0] = reader.nextInt(); y[0] = reader.nextInt()
        if ((x[0] < 0 ) || (y[0] < 0)) {
            println("프로그램을 종료합니다!!")
            break
        }
        print("오른쪽 아랫점(x2, y2)")
        x[1] = reader.nextInt(); y[1] = reader.nextInt()
        if ((x[1] < 0 ) || (y[1] < 0)){
            println("프로그램을 종료합니다!!")
            break
        }

        val width = abs(x[1] - x[0]); val height = abs(y[1] - y[0])
        val area = width * height
        val diagonal = sqrt(width.toDouble() * width.toDouble()
                + height.toDouble() * height.toDouble())

        if (area >= 30) {
            println("더 작은 사각형을 입력하세요!")
            continue
        }

        println("사각형의 넓이는 $area")
        println("각 4변의 길이는 $width, $height, $width, $height    대각선의 거리는 $diagonal")


    }
}


fun abs(a: Int) : Int {
    return if (a < 0) {
        (-1) * a
    }
    else if (a > 0) {
        a
    }
    else 0
}