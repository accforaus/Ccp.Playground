import java.util.Arrays


fun main(args: Array<String>) {
    val x = listOf("Australia", "Germany", "Korea", "United States of America")
    println(findLongest(x))


}

fun findLongest(x: List<String>): String {
    var lengths = listOf<Int>()


    for (i in 0..x.size-1)
    {
        lengths = lengths + x[i].length

    }

    val max = lengths.max()

    val index = lengths.indexOf(max)

    return x[index]
}