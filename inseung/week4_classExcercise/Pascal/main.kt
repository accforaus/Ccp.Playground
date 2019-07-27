fun main () {
    for (i in 1..5)
        println (Triangle(i).getRows())

    println(Triangle(4).getLastRow())
    println(Triangle(5).getLastRow())

    val twentieth = arrayListOf(
        1,
        19,
        171,
        969,
        3876,
        11628,
        27132,
        50388,
        75582,
        92378,
        92378,
        75582,
        50388,
        27132,
        11628,
        3876,
        969,
        171,
        19,
        1
    )

    println(Triangle(20).getLastRow() == twentieth)
}