/**
 * Write a function that accepts a string as a parameter and converts the first letter of each word of the string in upper case
 * @param str
 * @returns {string|string}
 */
function toUpper(str) {
    let arr = str.split("")
    let arr1 = []
    let arr2 = []
    for (let i = 0; i < arr.length; i++) {
        arr1.push(arr[i].charCodeAt(0))
    }

    for (let j = 0; j < arr1.length; j++) {
        if (arr1[j] === 32 && 96 < arr1[j+1] && arr1[j+1] < 123) {
            arr1[j+1] -= 32
        }
    }

    let result = ''
    for (let m = 0; m < arr1.length; m++) {
        arr2[m] = String.fromCharCode(arr1[m])
        result += arr2[m]
    }
    return result
}

console.log(toUpper('the quick brown fox'))
console.log(toUpper('Web Development Tutorial'))

