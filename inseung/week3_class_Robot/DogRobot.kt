class DogRobot : Robot () {
    override var model = ""
    override var distance = 10
    override var position = Coordinate2D(150, 150)
    override var price = 0
    override var ID = 0

    var barkPower = 10

    override fun show () {
        print("DogRobot         "); super.show(); print("barkPower = $barkPower \n")
    }

    fun barkStart () = println("Bark Power ${barkPower}으로 짖기 시작했습니다")
    fun barkStop () = println("Bark Power ${barkPower}으로 짖다가 멈추었습니다")
}