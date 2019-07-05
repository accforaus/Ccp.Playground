/**
 * Write a program to compute the sum of an array of integers
 * @param array
 * @returns {number|*}
 */
function sum(array) {
    let num = 0
    for (let i = 0; i < array.length; i++) num = num + array[i]
    return num
}

console.log(sum([1, 2, 3, 4, 5, 6]))
console.log(sum([1, -10, 2, -6]))