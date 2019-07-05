const findDivisor = require('../utilFolder/function findDivisor')

/**
 * Write a function which says whether a number is perfect.
 * @param x
 * @param y
 * @returns {Array}
 */
function findPerfectNumberByRange(x, y) {
    let arr1 = []
    let arr2 = []
    for (let i = x; i < y+1; i++) {
        arr1 = findDivisor(i)
        let t = arr1.length
        let total = 0
        for (let j = 0; j < t-1; j++) {
            total += arr1[j]
         }
        if (arr1[t-1] === total) {
            arr2.push(arr1[t-1])
        }
    }
    return arr2
}

console.log(findPerfectNumberByRange(1, 500))
console.log(findPerfectNumberByRange(95,28434))

