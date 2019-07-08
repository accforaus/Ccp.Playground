class Grade {
    constructor(math, science, english) {
        this.math = math
        this.science = science
        this.english = english
    }

    show() {
        let average = (this.math + this.science + this.english) / 3
        return `평균은 ${average}`
    }

}

myGrade = new Grade(100,95,96)
console.log(myGrade.show())