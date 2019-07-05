const sortFromMinimum = require('../utilFolder/function sortFromMinimum')

/**
 * Write a program to compute the exponent of a number
 * Note: The exponent of a number says how many times the base number is used as a factor
 * @param num
 * @returns {*}
 */
function exponent(num) {
    let arr = []
    for ( let i = 2 ; i < num+1 ; i++) {
        let base = i
        for ( let j = 2 ; j < num+1 ; j++ ){
            if (Math.pow( base, j ) === num ) {
                arr.push(j)
                }
            }
        }
    sortFromMinimum(arr)
    return arr[arr.length-1]
    }


console.log(exponent(64))
console.log(exponent(216))