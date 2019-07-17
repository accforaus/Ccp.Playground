package korea.Hwang.ccp.utils.RobotComparators

import korea.Hwang.ccp.domain.CleaningRobot
import korea.Hwang.ccp.domain.Robot

class RobotTypeComparator : Comparator<Robot> {
    override fun compare(o1: Robot?, o2: Robot?): Int = if (o1 is CleaningRobot) 1 else -1
}
