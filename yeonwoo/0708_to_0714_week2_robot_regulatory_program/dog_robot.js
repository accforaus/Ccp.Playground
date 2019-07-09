const Robot = require('./robot')

/**
 * Class with new key and method added to Robot class
 * a class that assign additional keys and values to some robot especially 'dog robot'
 * dog robot is a robot that seems like dog (animal) and is able to move
 *
 * <p>
 *     inherit from robot
 *     additional key = this.barkPower
 *          Since all robots do not have the function of 'power', I added only the 'bark power' key value.
 * </p>
 *
 * @author Yeonwoo Choi
 * @see see robot
 */
class DogRobot extends Robot{
    /**
     * Class with new key and method added to Robot class
     *
     * @author Yeonwoo Choi
     */
    constructor () {
        super()
        this.barkPower = 0
    }

    /**
     *method that assigns value to key
     * @param id
     * @param kind
     * @param name
     * @param x
     * @param y
     * @param price
     * @param distance
     * @param barkPower
     */
    setValue (id, kind, name, x, y, price, distance, barkPower) {

        this.robotId = id
        this.robotKind = kind
        this.robotName = name
        this.robotLocationX = x
        this.robotLocationY = y
        this.robotPrice = price
        this.robotDistance = distance
        this.barkPower = `${this.robotKind}=${barkPower}`
    }
}

module.exports = DogRobot