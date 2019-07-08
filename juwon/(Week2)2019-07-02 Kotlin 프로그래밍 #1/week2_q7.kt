fun main()
{

    println("${isEven(4)}")
    println("${isEven(5)}")
}

fun isEven(x: Int) : String {
    var st: String = "haha"
    if (x%2==0)
    {
        st = "Even"
    }
    else {
        st = "Odd"
    }
    return st
}
