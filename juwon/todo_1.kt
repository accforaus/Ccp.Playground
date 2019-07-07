fun main(args: Array<String>) {
    println("구구단 출력 프로그램입니다. \n 시작단을 입력하세요")
    var sp: Int = Integer.valueOf(readLine())
    println("마지막단을 입력하세요")
    var ep: Int = Integer.valueOf(readLine())


    while (sp <= ep) {
        for (i in 1..9) {
            var product: Int = sp* i
            println("$sp * $i = $product\n")
        }
        sp++
    }
}

