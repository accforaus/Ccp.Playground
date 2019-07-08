class Add {
    constructor () {
        this.int1 = 0
        this.int2 = 0
    }
    setValue (int1, int2) {
        this.int1 = int1
        this.int2 = int2
    }
    calculate () {
        return this.int1 + this.int2
    }
}

class Sub {
    constructor () {
        this.int1 = 0
        this.int2 = 0
    }
    setValue (int1, int2) {
        this.int1 = int1
        this.int2 = int2
    }
    calculate () {
        return this.int1 - this.int2
    }
}

class Mul {
    constructor () {
        this.int1 = 0
        this.int2 = 0
    }
    setValue (int1, int2) {
        this.int1 = int1
        this.int2 = int2
    }
    calculate () {
        return this.int1 * this.int2
    }
}

class Div {
    constructor () {
        this.int1 = 0
        this.int2 = 0
    }
    setValue (int1, int2) {
        this.int1 = int1
        this.int2 = int2
    }
    calculate () {
        return this.int1 / this.int2
    }
}


const add1 = new Add()
add1.setValue(7,2)
console.log(add1.calculate())

const add2 = new Add()
add2.setValue(9,23)
console.log(add2.calculate())

const sub1 = new Sub()
sub1.setValue(39,53)
console.log(sub1.calculate())

const sub2 = new Sub()
sub2.setValue(32,4)
console.log(sub2.calculate())

const mul1 = new Mul()
mul1.setValue(33,12)
console.log(mul1.calculate())

const mul2 = new Mul()
mul2.setValue(1,3)
console.log(mul2.calculate())

const div1 = new Div()
div1.setValue(9,3)
console.log(div1.calculate())

const div2 = new Div()
div2.setValue(100,10)
console.log(div2.calculate())


module.exports = Add
module.exports = Sub
module.exports = Mul
module.exports = Div