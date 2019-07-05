const sortFromMaximum = require('../utilFolder/function sortFromMaximum')

/**
 * Write a function to convert an amount to coins.
 * @param value
 * @param array
 * @returns {string|string}
 */
function amountToCoins(value, array) {
    sortFromMaximum(array)
    let array1 = []
    let t = 1
    for (let i = 0; i < array.length; i++) {
        array1.push(parseInt(value / array[i]))
        value = value - (array[i]) * (parseInt((value / array[i])))
    }
    let result = ''
    for (let m = 0 ;m < array1.length; m++) {
        while (array1[m] > 0) {
            result += array[m] + ' '
            array1[m] = array1[m] - 1
        }
    }
    return result
}

console.log(amountToCoins(46, [25, 10, 5, 2, 1]))
console.log(amountToCoins(193,[100, 50, 25, 6, 3, 1]))