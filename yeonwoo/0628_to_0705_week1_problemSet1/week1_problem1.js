/**
 * Write a program to calculate the factorial of a number
 *
 * @author rud527@naver.com
 * @param num
 * @returns {number}
 */
function factorial(num) {
    let num1 = 1
    for (let i =  num; i > 0; i--) {
        num1 = num1 * i
    }
    return num1
}

console.log(factorial(5))
console.log(factorial(12))