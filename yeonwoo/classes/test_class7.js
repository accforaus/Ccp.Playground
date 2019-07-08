class Circle {
    constructor (x, y, radius) {
        this.x = x
        this.y = y
        this.radius = radius
    }

    show () {
        return `(${this.x},${this.y})${this.radius}`
    }
}

circle1 = new Circle(3.0,3.0,5)
circle2 = new Circle(2.5,2.7, 6)
circle3 = new Circle(5.0, 2.0, 4)

let array = [circle1, circle2, circle3]

class CircleManager {

    constructor() {
        this.arr = []
    }

    add(circle) {
        this.arr.push(circle)
    }

    get(index) {
        return this.arr[index]
    }
}




a = new CircleManager(array)
console.log(a.arr())
console.log(circle1.show())
console.log(circle2.show())
console.log(circle3.show())



