fun main()
{
    input5()
}

fun input5()
{
    println("입력: ")
    var input: Int = Integer.valueOf(readLine())
    if ( input %2 ==0)
    {
        println("짝수입니다 다시입력하세요!")
        input5()
    }
    else if ( input < 0)
    {
        println("종료합니다")
    }
    else {
        println("\n")
        var stop: Int = input/2+1 //eg. 5 -> 3 3번째줄까지
        var i: Int = stop-1
        var j: Int = 1


        while(i>=0)
        {

            print(" ".repeat(i))
            if (i==stop-1)
            {
                print(" *\n")
            }
            else {

                print("*" + "  ".repeat(j) + " *\n")
                j++

            }

            i--

        }

       // j=stop+1
        var k: Int = 1
        var until : Int  = input/2
      //  println("hi")
        for (k in 1..until)

        {
        //    println("heythere") //- 여기까진됨
            print(" ".repeat(k))// - 여기가 문제야?? 왜?
       //   println("dope") //-여기안됨

            if (k==until){
           //     println("fdafdsf")
                print(" *\n")
            }
            else {
            //    println("aaaaa")
               print("*")
             //   print("*" + "  ".repeat(stop-i-1) + " *\n")
//j--
                print("  ".repeat(until-k)+" *\n")

              //  println("hey")
            }

        }


        input5()

    }
}//ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
