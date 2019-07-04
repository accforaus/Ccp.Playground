function getType(value) {
    if (typeof value === 'number') {
        return 'number'
    }
    if (typeof value === 'string') {
        return 'string'
    }
    if (typeof value === undefined) {
        return 'undefined'
    }
    if (typeof value === 'object') {
        return 'number'
    }
}

console.log(getType(1))
console.log(getType(''))
console.log(getType())
console.log(getType([]))


