import jdk.nashorn.internal.objects.NativeArray.indexOf

fun main() {
    println(find(listOf(1,2,3,4,5)))
}

fun find(x: List<Int>): String {
    var result = listOf<Int>()
    var realmax = x.max()!!.toInt() //5
    var realmin = x.min()!!.toInt() //1

    for (i in 0..x.size-1)
    {
        if (x[i] !== realmax && x[i] !== realmin)
            result = result + x[i]

    }

    var retuurn = listOf<Int>()
    retuurn = retuurn + result.min()!!
    retuurn = retuurn + result.max()!!
    return retuurn.joinToString(", ")

}