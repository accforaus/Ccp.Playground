fun main()
{
    println("${isPrime(59)}")
}

fun isPrime(x: Int): String {
    var a = ""
    for (i in 2..x-1)
    {
        if (x %i == 0 )
        {
            a = "is not a prime number"
        }
        else
        { a = "is a prime number"}
    }
    return a
}