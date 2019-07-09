
const Robot = require('./robot')

/**
 * Class with new key and method added to Robot class
 * a class that assign additional keys and values to some robot especially 'cleaning robot'
 * cleaning robot is a robot that moves and cleans some room with size 200 X 200
 *
 * <p>
 *     inherit from robot
 *     additional key = this.cleaningPower
 *          Since all robots do not have the function of 'power', I added only the 'cleaning power' key value.
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