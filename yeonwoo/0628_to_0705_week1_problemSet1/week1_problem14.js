const sortFromMinimum = require('../utilFolder/function sortFromMinimum')

/**
 * Write a function hat accepts a string as a parameter and counts the number of vowels within the string
 * @param str
 * @returns {string}
 */
function numOfVowels(str) {
    let arr1 = str.split(' ')
    for ( let i = 0 ; i < arr1.length ; i++){
        arr1[i] = arr1[i].length
    }
    sortFromMinimum(arr1)
    return arr1[0]
}


console.log(numOfVowels('The quick brown fox'))
console.log(numOfVowels('Nice to meet you'))