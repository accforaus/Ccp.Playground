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



class Calculator {
    constructor () {
        this.operator = 0
        this.add = new Add()
        this.sub = new Sub()
        this.mul = new Mul()
        this.div = new Div()
    }

    calculation (int1, int2, operator) {
        this.operator = operator
        if (this.operator === '+') {
            this.add.setValue(int1, int2)
            return this.add.calculate()
        }
        if (this.operator === '-') {
            this.sub.setValue(int1, int2)
            return this.sub.calculate()
        }
        if (this.operator === '*') {
            this.mul.setValue(int1, int2)
            return this.mul.calculate()
        }
        if (this.operator === '/') {
            this.div.setValue(int1, int2)
            return this.div.calculate()
        }

        return 'error'
    }
}

const calculator1 = new Calculator()
console.log(calculator1.calculation(100,5,"-"))
console.log(calculator1.calculation(124,324,'+'))
console.log(calculator1.calculation(2348,182,'*'))
console.log(calculator1.calculation(12320,11,'/'))
console.log(calculator1.calculation(12412,342,'nothing'))