fun main(args: Array<String>) {
   inputt()

}

fun inputt() {
    println("제곱하는 수 입력: ")
    var num1: Int = Integer.valueOf(readLine())
    println("제곱할 횟수 입력: ")
    var num2 : Int = Integer.valueOf(readLine())

    if (num1 ==0 && num2==0)
    {


        println("입력: 0\t0 \n종료합니다!")
    }
    else
    {
        println("입력: $num1 $num2")
        var i : Int = 1
        while ( i<=num2)
        {
            exponent(i, num1)
            i++
        }
        var c : Double = Math.pow(num1.toDouble(), num2.toDouble())
        println("\n최종 연산 결과 : $c\n")
        inputt()
    }
}

fun exponent(a: Int, b: Int)
{
    var product : Double = Math.pow(b.toDouble(), a.toDouble())
    println("$a:" + " ".repeat(a)+ "$b" + "* $b".repeat(a-1) + "= $product")

}