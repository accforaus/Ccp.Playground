import kotlin.math.abs

fun main () {

    input()


}


fun input() {

    println("왼쪽 윗점(x1,y1): ")
    var (x1, y1) = kotlin.io.readLine()!!.trim().split(" ").map (kotlin.String::toInt)

    if (x1 <0  ||y1 <0 )
    {
        println("출력: 프로그램을 종료합니다!")
    }

    else {
        println("오른쪽 윗점(x2,y2): ")
        var (x2, y2) = kotlin.io.readLine()!!.trim().split(" ").map(kotlin.String::toInt)

        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            println("출력: 프로그램을 종료합니다!")
        } else {

            var area: Int
            var lne: Int = x2 - x1
            lne = abs(lne)
            var wid: Int = y2 - y1
            wid = abs(wid)
            area = lne * wid

            var lneD = lne.toDouble()
            var widD = wid.toDouble()


            var diag: Double
            var squared: Double
            squared = Math.pow(lneD, 2.0) + Math.pow(widD, 2.0)

            diag = Math.sqrt(squared)







            if (area >= 30) {
                println("더 작은 사각형값을 입력하세요!")
            } else {
                print("사각형의 넓이는 $area\n각 4변의 길이는 $lne, $wid, $lne, $wid\t대각선의 길이는 $diag\n")
            }

            input()
        }


    }
}
