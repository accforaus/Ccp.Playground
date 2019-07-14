import java.lang.String
//ackage com.zetcode
//왜 안돼ㅠ


fun main() {
    println("${findPerfectNumberByRange(1,500)}")
}

fun findPerfectNumberByRange (x: Int, y: Int): List<Int> {
    var sumList = (mutableListOf<Int>())
    var i : Int = 0
    var j : Int = 0
    var summ = 0
    var perfect = (mutableListOf<Int>())

    for (i in x..y)
    {
        summ = 0
        for (j in 1..i)
        {
            if (i % j ==0)
            {
                summ = summ + j
              //  println(sumList)
            }
        }

        if (summ == 2*i)
        {
            perfect.add(i)
        }


    }
    return perfect
}