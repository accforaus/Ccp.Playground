package korea.Hwang.ccp.domain

class DogRobot : Robot() {
    var barkPower = 10 // korea.Hwang.ccp.domain.DogRobot's own property

    fun setInitialPosition () {
        super.position.x = 150
        super.position.y = 150
    }

    override fun show () {
        print("DogRobot         "); super.show(); print("barkPower = $barkPower \n")
    }

    fun barkStart () = println("Bark Power ${barkPower}으로 짖기 시작했습니다")
    fun barkStop () = println("Bark Power ${barkPower}으로 짖다가 멈추었습니다")
}