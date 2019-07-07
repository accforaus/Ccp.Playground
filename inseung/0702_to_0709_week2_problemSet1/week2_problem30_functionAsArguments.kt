/*
Write a function to pass a 'JavaScript function' as parameter.

function f() {
    // body
}

function f2(f) {
    f()
}

console.log(f2(f)) // output `Hello world`

 */

import java.util.*

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    f3(::f1)
    f3(::f2)
}

fun f1 () {
    println ("Hello Wolrd!")
}

fun f2 () {
    println ("Bye World!")
}

fun f3(myFunc: () -> (Unit)) {
    myFunc()
}

/*
:: 연산자는 뭔가요!!!

myFunc: Function 을 치면 tooltip 에 Fucntion <> 이 뜨던데
Function <> 처럼 <> 안에 들어가는 명령은 무슨 뜻인가요 type을 명시하는 건가요?

다음과 같이 함수를 lambda 기호로 감싸서
부를 수 있더군요..  그냥 메모 해둡니다..
class Operator {
    fun add(a: Int, b: Int) = a + b
    fun inc(a: Int) = a + 1
}

fun calc(a: Int, b: Int, opr: (Int, Int) -> Int) = opr(a, b)
fun calc(a: Int, opr: (Int) -> Int) = opr(a)

fun main(args: Array<String>) {
    calc(1, 2, { a, b -> Operator().add(a, b) })
    calc(1, { Operator().inc(it) })
}
 */




