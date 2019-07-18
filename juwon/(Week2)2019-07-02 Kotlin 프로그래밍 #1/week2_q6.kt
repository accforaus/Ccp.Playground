fun main() {
    println(fibonacci(8))
}

fun fibonacci(x: Int) : Int {
    var list = arrayListOf(1,1)

    var a= 0

    for ( i in 2..x)
    {
        a = list.get(i-2) + list.get(i-1)

        list.add(a)

    }

    return list[x-1]

}