fun main () {
    println(amountToCoins(46, listOf(25, 10, 5, 2, 1)))
}

fun amountToCoins(x: Int, y: List<Int>): String {
    var order = y.sortedDescending() //이게 순서대로 넣어진 리스트. 이제 이거 사용해
    var result = listOf<Int>() //여기에 담을거야
    var rest = x //나머지 계산 얘로 할거야
    for (i in 0..order.size-1)
    {
        //이제 큰 순서대로 있으면 들어가는지 볼거야
        while (rest >= order[i])
        {
            result = result + order[i]
            rest = rest - order[i]
        }

    }

    return result.joinToString(", ")
}