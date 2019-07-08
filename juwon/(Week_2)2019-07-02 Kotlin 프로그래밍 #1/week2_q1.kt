fun main (){

    println("output: ${factorial(5)}")

}

fun factorial(x: Int): Int {

    var product =1
    for (i in 1..x) //=while (i<=x)
    {
        product = product*i
    }
    return product


}

