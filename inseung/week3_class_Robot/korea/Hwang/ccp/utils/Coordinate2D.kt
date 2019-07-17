package korea.Hwang.ccp.utils

import MAP_SIZE

data class Coordinate2D (var x: Int, var y: Int) { //x y 좌표와 distance 만큼 이동하는 함수 포함
    fun showPosition() = print("${x}   ${y}")

    fun move (direction: Int, distance: Int) {
        fun moveX (direction: Int)  {
            if (x + distance !in 0..MAP_SIZE) return //이동후 위치가 map의 크기 200과 0을 넘어가면 움직이지 않음
            else x = x + direction
        }
        fun moveY (direction: Int) {
            if (y + distance !in 0..MAP_SIZE) return
            else y = y + direction
        }
        when (direction) {
            1 -> moveY(distance)
            2 -> moveY((-1) * distance)
            3 -> moveX((-1) * distance)
            else -> moveX(distance)
        }
    }
}