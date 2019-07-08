class Rectangle {
    constructor(x, y, width, height) {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }

    show () {
        return `(${this.x}, ${this.y})에서 크기가 ${this.width}X${this.height}인 사각형`
    }

    square () {
        return this.width * this.height
    }

    contains (theOtherRectangle) {
        let a = this.x + this.width / 2
        let b = this.y + this.height / 2
        let compareA = theOtherRectangle.x + theOtherRectangle.width / 2
        let compareB = theOtherRectangle.y + theOtherRectangle.height / 2
        return (a >= compareA) && (b >= compareB)
    }
}

const r = new Rectangle(2,2,8,7)
const s = new Rectangle(5,5,6,6,)
const t = new Rectangle(1,1,10,10,)

console.log(r.show())
console.log("s의 면적은 " + s.square())
if (t.contains(r)) console.log('t는 r을 포함합니다.')
if (t.contains(s)) console.log('t는 s을 포함합니다.')
