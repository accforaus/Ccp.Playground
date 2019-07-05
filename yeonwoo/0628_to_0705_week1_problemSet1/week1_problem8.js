/**
 * Write a function that reverse a number
 * 숫자 너무 크면 infinity 떠서 첫번째 for문에서 값이 못나와여
 * @param num
 * @returns {string|string}
 */
function reverseOnlyNumber(num) {
    arr = []
    arr1 = []
    for (let i = num; i > -1; i--) {
        let exponent = Math.pow(10,i)
        if (num / exponent >= 1) {
            arr.push(parseInt( num / exponent))
            num = num - Math.pow(10,i) * parseInt( num / exponent)
        }
    }
    let result = ''
    for (let j = arr.length-1; j >= 0; j--) {
        arr1.push(arr[j])
        result += arr[j]
    }
    return result
}

console.log(reverseOnlyNumber(32243))
console.log(reverseOnlyNumber(23859))
