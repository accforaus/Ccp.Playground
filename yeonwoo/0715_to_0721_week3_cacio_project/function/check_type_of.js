function checkTypeOf (input) {
    let check = typeof (input)
    if (check === "object") {
        return 'json'
    }
    if (check === "string") {
        return 'text'
    }
    if (check === 'number') {
        return 'text'
    }
}

module.exports = checkTypeOf