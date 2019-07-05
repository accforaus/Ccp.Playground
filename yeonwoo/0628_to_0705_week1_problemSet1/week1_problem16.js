/**
 * Write a function which accepts an argument and returns the type.
 * @param value
 * @returns {"undefined"|"object"|"boolean"|"number"|"string"|"function"|"symbol"|"bigint"}
 */
function getType(value) {
    return typeof value
}

console.log(getType(1)) // output 'number'
console.log(getType('')) // output 'string'
console.log(getType()) // output 'undefined'
console.log(getType([])) // output 'object'
