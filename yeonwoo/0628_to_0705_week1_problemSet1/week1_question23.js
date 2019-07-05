/**
 * Write a function that returns array elements larger than a number.
 * @param val
 * @returns {*}
 */
function biggerElements(val) {
    for (let i = val.length - 1; i > -1; i--) {
        if (val[i] <= val.length) {
            val.splice(i,1)
        }
    }
    return val
}

console.log(biggerElements([11, 45, 4, 31, 64, 10]))
console.log(biggerElements([1,2,3,4,5,6,7,8,9,10,120]))