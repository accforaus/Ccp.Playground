
fun all(x: Array<Int>) {


    var score = input4()
    var sum : Int = x[0]
    var product : Int = x[1]
    var average : Int = x[2]
    var b : Int = x[3]

    if (score == -1)
    {
        println("종료합니다")
    }
    else if(score==0)
    {
        //값출력
        var grade : Char = 'F'
        if (average>=90)
        {
            grade = 'A'
        }
        if (average>=80 && average <90)
        {
            grade = 'B'
        }
        if (average<80)
        {
            grade = 'C'
        }
        print("합결과: $sum\t곱셈결과: $product\n평균:$average\t학점: $grade")
        var variablesnew= arrayOf(0,1,0,1)
        all(variablesnew)
    }
    else {
        //계속


        sum = sum+score
        product = product*score
        average = sum/b
        b++
        var variables2 = arrayOf(sum, product, average, b)
        all(variables2)
    }
}


fun input4() :Int {
    println("입력: ")
    var num: Int = Integer.valueOf(readLine())
    return num
}

fun main()
{
    var variables = arrayOf(0,1,0,1)
   // var sum : Int = 0
   // var product : Int = 1
   // var average : Int = 0
   // var b : Int = 1
    all(variables)

}
//ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ