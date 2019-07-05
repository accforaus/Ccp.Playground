const sortFromMinimum = require('../utilFolder/function sortFromMinimum')

/**
 * Write a function that that accepts a string as a parameter and find the longest word within the string
 * @param str
 * @returns {string}
 */
function longest(str) {
    let arr1 = str.split(' ')
    sortFromMinimum (arr1)
    return arr1[arr1.length-1]
}

console.log(longest('Web Development Tutorial'))