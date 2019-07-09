const Robot = require('./robot')
class DogRobot extends Robot{
    /**
     * Class with new key and method added to Robot class
     *
     * @author Yeonwoo Choi
     */
    constructor () {
        super()
        this.dogPower = 0
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
     * @param dogPower
     */
    setValue (id, kind, name, x, y, price, distance, dogPower) {

        this.robotId = id
        this.robotKind = kind
        this.robotName = name
        this.robotLocationX = x
        this.robotLocationY = y
        this.robotPrice = price
        this.robotDistance = distance
        this.dogPower = `${this.robotKind}=${dogPower}`
    }
}

module.exports = DogRobot