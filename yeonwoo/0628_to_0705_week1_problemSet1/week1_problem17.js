const sortFromMaximum = require('../utilFolder/function sortFromMaximum')

/**
 * Write a function which will take an array of numbers stored and find the second lowest and second greatest numbers, respectively.
 * @param array
 * @returns {string}
 */
function find(array) {
    sortFromMaximum(array)
    return `${array[array.length-2]} , ${array[1]}`
}

console.log(find([1, 2, 3, 4, 5]))