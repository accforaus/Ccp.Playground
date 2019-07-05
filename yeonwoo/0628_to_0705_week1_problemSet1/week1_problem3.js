/**
 * Write a program to get the integers in range (x, y)
 * @param x
 * @param y
 * @returns {Array}
 */
function range(x, y) {
    let arr = []
    for (let i = x+1; i < y; i++) arr.push(i)
    return arr
}

console.log(range(2, 9))
console.log(range(-43,13))
console.log(range(9,2))