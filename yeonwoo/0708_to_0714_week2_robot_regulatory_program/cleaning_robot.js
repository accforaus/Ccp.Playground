
const Robot = require('./robot')

/**
 * Class with new key and method added to Robot class
 *
 * @author Yeonwoo Choi
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