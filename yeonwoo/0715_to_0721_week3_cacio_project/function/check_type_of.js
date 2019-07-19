function checkTypeOf (input) {
    return typeof(input) === 'object' ? 'json' : 'text'
}

module.exports = checkTypeOf