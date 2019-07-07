
fun input6() {
    println("입력:")
    var num: Int = Integer.valueOf(readLine())

    if (num < 5 && num>=0)
    {
        println("5보다 큰 값을 입력하셔야 합니다!")
        input6()
    }

    else if (num <0)
    {
        println("종료합니다!")

    }

    else if (num>=5)
    {
        var i: Int = 0
        for (i in 0..num-1)
        {

            if (i==0 || i==num-1)
            {
                print("$i:")
                print(" ".repeat(i))
                print("*".repeat(num-i))
                print("\n")

            }
            else {
                var j: Int = num-i-2
                print("$i:")
                print(" ".repeat(i))
                print("*")
                print(" ".repeat(j))
                print("*")
                print("\n")


            }


        }




        input6()
    }


}


fun main() {

    input6()




}
//와 됐다!