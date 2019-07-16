class CleaningRobot : Robot () {
    override var model = ""
    override var distance = 3
    override var position = Coordinate2D(30, 30)
    override var price = 0
    override var ID = 0

    var cleaningPower = 10

    override fun show () {
        print("CleaningRobot    "); super.show(); print(" cleaningPower = $cleaningPower \n")
    }
    fun cleaningStart () = println("Cleaning Power ${cleaningPower}으로 청소를 시작했습니다")
    fun cleaningStop () = println("Cleaning Power ${cleaningPower}으로 청소를 멈추었습니다")
}