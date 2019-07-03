import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        print("입력 : ")
        val selector = reader.next()
        val input = reader.nextDouble()

        if (selector.equals("x")) {
            println("종료합니다!")
            break
        } else if (selector.equals("c")) {
            val c = input
            val f = (input * 1.8) + 32
            weather(c, f, selector)
        } else if (selector.equals("f")) {
            val c = (input - 32) / 1.8
            val f = input
            weather(c, f, selector)
        } else {
            println("다시 입력하세요~")
            continue
        }
    }
}

fun weather(temperature: Double, Fatrenheit: Double, selector: String ) {
    if (selector.equals("c")) println("섭씨 $temperature 도는 화씨 $Fatrenheit 도 입니다.")
    else println("화씨 $Fatrenheit 도는 섭씨 $temperature 도 입니다.")

    if (temperature <= -30) println("한국 기온 맞습니까?")
    else if (temperature > -30 && temperature <= -10) println("날씨가 춥습니다! 외출 자제하세요!")
    else if (temperature > -10 && temperature <= 10) println("쌀쌀한 날씨네요!")
    else if (temperature > 10 && temperature <= 25) println("쾌적한 날씨입니다~")
    else println("더워요~")
}