fun main() {
    println("output: ${GCD(380, 500)}")
    println("output: ${GCD(50, 30)}")
    println("output: ${GCD(3949350, 4693496)}")

}

fun GCD(a: Int, b: Int): Int {
    var divisor = 1

    for (i in a downTo 1)
    {
//여기까지 오긴해
        if (a%i==0 && b %i ==0)
        {
            //저장
            //check - if -> println
            //else ->

            divisor = i
            break


        }
    }

    return divisor

}