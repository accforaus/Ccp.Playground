import java.util.Scanner

fun comment(a: Double)
{
    if (a<=-30)
    {
        println("한국 기온 맞습니까?")
    }
    if (a>-30 && a<=-10)
    {
        println("날씨가 춥습니다! 외출 자제하세요!")
    }
    if (a>-10 && a<=10)
    {
        println("쌀쌀한 날씨네요")
    }

    if (a>10 && a<=25)
    {
        println("쾌적한 날씨입니다~")
    }

    if (a>25)
    {
        println("더워요~")
    }
}


fun input8() {
    println("입력")
    // val scanner = Scanner(System.in)
   //  var (cual, temp) = scanner.nextDouble()
  //  var (x1, y1) = kotlin.io.readLine()!!.trim().split(" ").map (kotlin.String::toInt)

    var (cual_temp, temp_temp) = readLine()!!.split(" ")
    var cual = cual_temp.single()
    var temp = temp_temp.toDouble()

    if (cual =='c')
    {
        var convertedF: Double = 0.0
        convertedF = (temp*1.8)+32
        println("섭씨 $temp 도는 화씨 $convertedF 도입니다")
        comment(temp)
        input8()
    }

    else if (cual =='f')
    {
        var convertedC: Double = 0.0
        convertedC = (temp-32)/1.8
        println("화씨 $temp 도는 섭씨 $convertedC 도입니다")
        comment(convertedC)
        input8()
    }

    else if (cual == 'x')
    {
        println("종료합니다!")
    }

    else {
        println("다시 입력하세요~")
        input8()
    }




}

fun main()
{
    input8()


}

