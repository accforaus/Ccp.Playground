/**
 * Write a function that accepts two arguments, a string and a letter and the function will count the number of occurrences of the specified letter within the string.
 * @param str
 * @param ch
 * @returns {number}
 */
function charCount(str, ch) {
    let arr = str.split('')
    let num = 0
    for (let i = 0; i < arr.length; i++) {
        if (ch === arr[i]) num += 1
    }
    return num
}

console.log(charCount('ourhours.com', 'o'))
console.log(charCount('ourhourourhour.com','h'))