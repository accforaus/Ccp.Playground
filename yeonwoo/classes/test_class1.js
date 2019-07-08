class Student {
    constructor() {
        this.name = ''
        this.age = 0
        this.grade = 1
    }

    getName () {
        return `This is ${this.name}`
    }

    setName (name) {
        this.name = name
    }

    getAge () {
        return this.age
    }

    setAge (age) {
        this.age = age
    }

    getGrade () {
        return this.grade
    }

    setGrade(grade) {
        this.grade = grade
    }

    toString () {
        return `My name is ${this.name} and I'm ${this.age} years old. And also my grade is ${this.grade}`

    }
}

const choi = new Student()
const kichun = new Student()

choi.setName('Choiyeonwoo')
kichun.setName('LeeKichun')
choi.setAge(24)
kichun.setAge(25)
choi.setGrade(2)
kichun.setGrade(3)

console.log(choi.getName())
console.log(kichun.getName())
console.log(choi.toString())
console.log(kichun.toString())