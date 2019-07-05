/**
 * Write a program to check whether a number is even or not
 * @param num
 * @returns {string}
 */
function isEven(num) {
    if (num % 2 === 0)return 'Even'
    else return 'Odd'
}

console.log(isEven(73))
console.log(isEven(92))