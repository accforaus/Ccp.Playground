package korea.Hwang.ccp.utils.RobotComparators

import korea.Hwang.ccp.domain.Robot

class RobotIDComparator : Comparator<Robot> {
    override fun compare(o1: Robot?, o2: Robot?): Int {
        return o1!!.ID.compareTo(o2!!.ID)
    }
}