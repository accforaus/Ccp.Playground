class Robot {
    constructor () {
        this.robotId = 0
        this.robotName = ''
        this.robotPrice = 0
        this.robotLocationX = 0
        this.robotLocationY = 0
        this.robotDistance = 0
        this.array = []
    }

    arrayList (id, x, y, price, distance) {
        this.robotId = id
        this.robotName = ''
        this.robotPrice = price
        this.robotLocationX = x
        this.robotLocationY = y
        this.robotDistance = distance
        this.array.push([`${this.robotId}`, `        ${this.robotName}`, `        ${this.robotLocationX}`, `        ${this.robotLocationY}`,         `        ${this.robotPrice}`,`           ${this.robotDistance}         `])
        return this.array
    }

    changeLocation (up, down, left, right) {
        if (this.robotLocationX + (right - left) > -1 && this.robotLocationY + (up - down) > -1 && this.robotLocationX + (right - left) < 201 && this.robotLocationY + (up - down) < 201) {
            this.robotLocationY += (up - down)
            this.robotLocationX += (right - left)
        }
        if (this.robotLocationX + (right - left) >= 200) {
            this.robotLocationX = 200
        }
        if (this.robotLocationY + (up - down) >= 200) {
            this.robotLocationY = 200
        }
        if (this.robotLocationX + (right - left) <= 0) {
            this.robotLocationX = 0
        }
        if (this.robotLocationY + (up - down) <= 0) {
            this.robotLocationY = 0
        }
    }
}

class CleaningRobot extends Robot {
    constructor() {
        super()
        this.cleaningPower = 0
        this.kindName = 'CleaningRobot'
    }

    modifyList (robotName, cleaningPower) {
        this.cleaningPower = cleaningPower
        this.robotName = robotName
        for (let i = 0; i < this.array.length; i++) {
            this.array[i].push(`cleaningPower=${this.cleaningPower}`)
            let a = this.robotId
            this.array[i].splice(0, 1)
            this.array[i].unshift(this.kindName)
            this.array[i].unshift(`${a}        `)
            return this.array[i] + `\n`
        }
    }

    cleaningStart() {
        return `cleaningPower ${this.cleaningPower}으로 청소를 시작했습니다`
    }
    cleaningStop() {
        return `cleaningPower ${this.cleaningPower}의 청소를 멈추었습니다`
    }
}


class DogRobot extends Robot{
    constructor() {
        super()
        this.barkPower = 0
        this.kindName = 'DogRobot'
    }

    modifyList (robotName, barkPower) {
        this.barkPower = barkPower
        this.robotName = robotName
        for (let i = 0; i < this.array.length; i++) {
            this.array[i].push(`barkPower=${this.barkPower}`)
            let a = this.robotId
            this.array[i].splice(0, 1)
            this.array[i].unshift(this.kindName)
            this.array[i].unshift(`${a}        `)
        }
    }

    barkStart() {
        return `barkPower ${this.barkPower}으로 짖기 시작했습니다`
    }
    barkDown() {
        return `barkPower ${this.barkPower}으로 짖다 멈추었습니다`
    }
}

class RobotManager {
    constructor() {
        this.totalRobotList = []
    }

    insertRobotData (arr) {
        this.totalRobotList.push(arr)
        for (let i = 0; i < this.totalRobotList.length; i++) {
            this.totalRobotList[i].unshift(i+1)
        }
    }

    ShowRobotList () {
        let result = ''
        console.log(`번호     Id             종류             Robot명         x          y         price       distance         etc`)
        for (let i = 0; i < this.totalRobotList.length; i++) {
            for (let j = 0; j < this.totalRobotList[i].length; j++) {
                result += this.totalRobotList[i][j] + `        `
            }
            console.log(`${result}\n`)
            result = ''
        }
    }
}



cleaningRobot = new CleaningRobot()
cleaningRobot.arrayList(2,20,20,200,3)
cleaningRobot.modifyList('클리니',4)

dogRobot = new DogRobot()
dogRobot.arrayList(2,30,30,150,10)
dogRobot.modifyList('도그1',10)

robotManager = new RobotManager()
robotManager.insertRobotData(cleaningRobot.array)
console.log(robotManager.ShowRobotList())