function f() {
    return `Hello world`
}

function f2(f) {
    return f()
}

console.log(f2(f))