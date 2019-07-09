const Robot = require('./robot')

/**
 * A class containing several methods for robot objects
 *
 * <p>
 *     inherit from robot
 *     A method that targets an object associated with a robot class
          => insertRobotData, checkRobotList, changeLocation, searchByCostRange, searchRobotByName, searchRobotById
 * </p>
 *
 * @author Yeonwoo Choi
 * @see robot
 */

class RobotManager extends Robot{
    constructor() {
        super()
        this.totalRobotList = []
    }

    /**
     * Method to put robot data in array form in this.totalRobotData
     * @param object
     */
    insertRobotData(object) {
        let array = Object.keys(object)
        let array1 = []
        for (let i = 0; i < array.length; i++) {
            array1.push(object[array[i]])
        }
        this.totalRobotList.push(array1)
        for (let i = 0; i < this.totalRobotList.length; i++) {
            if (this.totalRobotList[i].length === 8) {
                this.totalRobotList[i].unshift(i + 1)
            }
        }
    }

    /**
     * method to call data stored in this.totalRobotArray
     * @returns {string}
     */
    checkRobotList() {
        console.log(`번호     RobotId        종류          Robot명          x         y       price       distance        etc`)
        let result = ''
        for (let j = 0; j < this.totalRobotList.length; j++) {
            for (let k = 0; k < this.totalRobotList[j].length; k++) {
                result += this.totalRobotList[j][k] + `         `
            }
            console.log(result)
            result = ''
        }
        return ''
    }

    /**
     * A method of moving the position of an individual robot by using the move method of the robot class
     * @param object
     * @param up
     * @param down
     * @param left
     * @param right
     * @returns {string}
     */
    changeLocation (object, up, down, left, right) {
        let array = Object.keys(object)
        let array1 = []
        for (let i = 0; i < array.length; i++) {
            array1.push(object[array[i]])
        }
        object.move(up, down, left, right)
        let array2 = Object.keys(object)
        let array3 = []
        for (let i = 0; i < array.length; i++) {
            array3.push(object[array2[i]])
        }
        return `${array1[1]} ${array1[2]}이 ${array1[3]} ${array1[4]} 위치에서 ${array3[3]} ${array3[4]}로 이동하였습니다`
    }

    /**
     * A method that delete the data stored in this.totalRobotData
     * @param robotId
     * @returns {string}
     */
    deleteRobot (robotId) {
        for (let i =0; i < this.totalRobotList.length; i++) {
            if (robotId === this.totalRobotList[i][1]) {
                this.totalRobotList.splice(i,1)
                return `id ${i}번 로봇을 삭제하였습니다`
            }
        }
    }

    /**
     * A method that calls only the data within the price category that you enter from the stored data.
     * @param minimum
     * @param maximum
     * @returns {string|string}
     */
    searchByCostRange (minimum, maximum) {
        let result = ''
        for (let i = 0; i < this.totalRobotList.length; i++) {
            if (minimum <= this.totalRobotList[i][7] && maximum >= this.totalRobotList[i][7]) {
                for (let j = 0; j < this.totalRobotList[i].length; j++) {
                    result += this.totalRobotList[i][j] + `         `
                }
            }result += `\n`
        }
        return result
    }

    /**
     * A method that search robot data by name
     * @param name
     * @returns {string|string}
     */
    searchRobotByName (name) {
        let result = ''
        for (let i = 0; i < this.totalRobotList.length; i++) {
            if (this.totalRobotList[i][3] === name) {
                for (let j = 0; j < this.totalRobotList[i].length; j++) {
                    result += this.totalRobotList[i][j] + `         `
                }
            } result += `\n`
        }
        return result
    }

    /**
     * A method that search robot data by Id
     * @param id
     * @returns {string|string}
     */
    searchRobotById (id) {
        let result = ''
        for (let i = 0; i < this.totalRobotList.length; i++) {
            if (this.totalRobotList[i][1] === id) {
                for (let j = 0; j < this.totalRobotList[i].length; j++) {
                    result += this.totalRobotList[i][j] + `         `
                }
            } result += `\n`
        }
        return result
    }
}

module.exports = RobotManager