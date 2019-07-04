function factorial(num) {
    let num1 = 1
    for(let i =  num ; i > 0 ; i--) {
        num1 = num1 * i
    }
    return num1
}

console.log(factorial(5))