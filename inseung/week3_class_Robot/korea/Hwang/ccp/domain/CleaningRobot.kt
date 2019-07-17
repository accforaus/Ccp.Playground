package korea.Hwang.ccp.domain

class CleaningRobot : Robot() {
    var cleaningPower = 10 // korea.Hwang.ccp.domain.CleaningRobot's own property
    

    fun setInitialPosition () {
        super.position.x = 30
        super.position.y = 30
    }



    override fun show () {
        print("CleaningRobot    "); super.show(); print(" cleaningPower = $cleaningPower \n")
    }
    fun cleaningStart () = println("Cleaning Power ${cleaningPower}으로 청소를 시작했습니다")
    fun cleaningStop () = println("Cleaning Power ${cleaningPower}으로 청소를 멈추었습니다")
}