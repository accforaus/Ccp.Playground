const sortFromMaximum = require('../utilFolder/function sortFromMaximum')

/**
 * Write a function that accept a list of country names as input and returns the longest country name as output.
 * @param arr
 * @returns {*}
 */
function findLongest(arr) {
    sortFromMaximum(arr)
    return arr[0]
}

console.log(findLongest(['Australia', 'Germany', 'Korea', 'United States of America']))
console.log(findLongest(['abcde', 'abcdefg', 'abc', 'abcdefgh', 1234567, []]))