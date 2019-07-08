class TV {
    constructor(name, year, length) {
        this.name = name
        this.year = year
        this.length = length
    }


    show () {
        return `${this.name}에서 만든 ${this.year}년형 ${this.length}인치 TV`
    }
}

myTV = new TV("LG",2017,32)

console.log(myTV.show())