package korea.Hwang.ccp.utils.RobotComparators

import korea.Hwang.ccp.domain.Robot

class RobotPriceComparator : Comparator<Robot> {
    override fun compare(o1: Robot?, o2: Robot?): Int {
        return o1!!.price.compareTo(o2!!.price)
    }
}