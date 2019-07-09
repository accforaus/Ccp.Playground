
const Robot = require('./robot')

/**
 * A class that assign additional keys & values to robot especially 'cleaningRobot'
 *
 * <p>
 *     inherit from robot
 *     additional key = this.cleaningPower
 * </p>
 *
 * @author Yeonwoo Choi
 * @see see robot
 */
class CleaningRobot extends Robot{
    constructor () {
        super()
        this.cleaningPower = 0
    }

    /**
     * method that assigns value to key
     * @param id
     * @param kind
     * @param name
     * @param x
     * @param y
     * @param price
     * @param distance
     * @param cleaningPower
     */
    setValue (id, kind, name, x, y, price, distance, cleaningPower) {
        this.robotId = id
        this.robotKind = kind
        this.robotName = name
        this.robotLocationX = x
        this.robotLocationY = y
        this.robotPrice = price
        this.robotDistance = distance
        this.cleaningPower = `${this.robotKind}=${cleaningPower}`
    }
}

module.exports = CleaningRobot