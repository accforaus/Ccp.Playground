class Rectangle {
    constructor() {
        this.horizon1 = 1
        this.horizon2 = 2
        this.vertical1 = 3
        this.vertical2 = 4
    }

    getLengthHorizon () {
        return `Horizontal length is ${this.horizon1}.`
    }

    getLengthVertical () {
        return `Vertical length is ${this.vertical1}`
    }

    setHorizon (horizon1, horizon2) {
        this.horizon1 = horizon1
        this.horizon2 = horizon2
    }


    setVertical (vertical1, vertical2) {
        this.vertical1 = vertical1
        this.vertical2 = vertical2
    }

    isSquare () {
        return  this.vertical1 === this.horizon1
    }

    compareTo (rectangle) {
        return rectangle.horizon1 === this.horizon1 && rectangle.vertical1 === this.vertical1
    }

    toString () {
        return `H1 : ${this.horizon1} and V1 : ${this.vertical1}`
    }

}

const square1 = new Rectangle()
const square2 = new Rectangle()

square1.setHorizon(10,10)
square1.setVertical(10,10)

square2.setHorizon(10,10)
square2.setVertical(10,10)

console.log(square1.isSquare())
console.log(square2.isSquare())
console.log('---------')
console.log(square1.compareTo(square2))
console.log(square1.toString())