fun main() {
    println("output: ${reverse(12345)}")
}

fun reverse(x: Int) : Int {
    //12345
    // 12345%10 = 5 = 1st
    var num : Int = x
    var rvsd : Int = 0

    while (num != 0)
    {
        var revdig : Int = num%10 //5 . 1234 -> 4
        rvsd = rvsd*10 + revdig // 5. 54.
        num = num/10 //1234.5
    }
    return rvsd

}
