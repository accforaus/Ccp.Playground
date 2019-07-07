fun main(args: Array<String>) {
   inputs()

}

fun inputs() {
    println("첫번째값 입력: ") //정수값 2개 받는법?
    var num1 : Int = Integer.valueOf(readLine())
    println("두번째값 입력: ")
    var num2 : Int = Integer.valueOf(readLine())
    if (num1 >0 && num2 >0)
    {
        print("\n".repeat(num1))

       var i: Int = 1
       while (i <=num2){
           hello(i)
           i++
       }


        inputs()
    }
    else {
        println("종료합니다!")
    }
}

fun hello (a: Int) {
    println("$a:" + " ".repeat(a) + "Hello World! ".repeat(a))
}