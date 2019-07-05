/**
 * Write a function that checks whether a passed string is palindrome or not?
 * @param str
 * @returns {string}
 */
function palindrome(str) {
    let arr = str.split('')
    let arr1 = []
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === arr[arr.length-i-1]) arr1.push(i)
    }
    if (arr1.length === str.length) {
        return 'true'
    } else return 'false'
}

console.log(palindrome('토마토'))
console.log(palindrome('비글왈!'))
console.log(palindrome('asdjfakdja'))
console.log(palindrome('abcdefghhgfedcba'))