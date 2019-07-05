/**
 * Write a function to pass a 'JavaScript function' as parameter.
 * @returns {string}
 */
function f() {
    return `Hello world`
}


function f2(f) {
    return f()
}

console.log(f2(f))