package korea.Hwang.ccp.utils.RobotComparators

import korea.Hwang.ccp.domain.Robot

class RobotModelComparator : Comparator<Robot> {
    override fun compare(o1: Robot?, o2: Robot?) : Int = o1!!.model.compareTo(o2!!.model)
}