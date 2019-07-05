const sortFromMinimum = require('../utilFolder/function sortFromMinimum')

/**
 * Write a program to find the greatest common divisor (GCD) of two positive numbers
 * @param num1
 * @param num2
 * @returns {*}
 * @constructor
 */
function GCD(num1, num2) {
    let array = []
    for (let i = 2; i < num1 + 1; i++) {
        if (num1 % i === 0 && num2 % i === 0) {
            array.push(i)
        }
    }
    sortFromMinimum(array)
    return array[0]
}


console.log(GCD(380, 500))
console.log(GCD(50, 30))
console.log(GCD(3949350, 4693496))