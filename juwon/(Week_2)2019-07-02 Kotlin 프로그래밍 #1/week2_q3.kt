fun main () {
    println("${range(2,9)}")

}

fun range(a: Int, b: Int) : List<Int>
{

    var rraa = mutableListOf<Int>()
    for (i in a+1..b-1)
    {
        rraa.add(i)
    }

    return rraa
}