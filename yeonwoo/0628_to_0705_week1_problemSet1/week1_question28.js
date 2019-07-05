const sortFromMaximum = require('../utilFolder/function sortFromMaximum')

/**
 * Write a function to find longest substring in a given a string without repeating characters.
 * @param str
 * @returns {string|string}
 */
function findLongestSubstring(str) {
    let arr = str.split('')
    let arr1 = []
    for ( let i = arr.length-2 ; i >= 0 ; i--) {
        for ( let j = i-1 ; j >=0 ; j--) {
            if ( arr[i] === arr[j] ) arr1.push(j)
        }
    }

    arr1 = sortFromMaximum(arr1)

    for ( let n = arr1.length-1 ; n >=0 ; n--) {
        for ( let l = n-1 ; l >=0 ; l--) {
            if (arr1[l]===arr1[n]) arr1.splice(n,1)
        }
    }

    let result = ''
    for ( let k = 0 ; k < arr1.length ; k++) {
        arr.splice(arr1[k],1)
    }
    for ( let m = 0 ; m< arr.length ; m++){
        result += arr[m]
    }
    return result
}

console.log(findLongestSubstring('google.com'))

console.log(findLongestSubstring('example.com'))

console.log(findLongestSubstring('yahoo.com'))