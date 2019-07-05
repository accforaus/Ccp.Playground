/**
 * Write a function to find the first not repeated character.
 * @param str
 * @returns {string}
 */
function findNotRepeat(str) {
    let arr = str.split('')
    let arr1 = []
    for (let i = 0; i < arr.length; i++) {
        let num = 0
        for (let j = 0; j < arr.length; j++) {
            if (arr[j] === arr[i]) num += 1
        }
        arr1.push(num)
    }
    let solo = ''
    for (let k = 0; k < arr1.length; k++) {
        if (arr1[k] === 1) solo += `${arr[k]} `
    }
    return solo
}

console.log(findNotRepeat('abacddbec'))
console.log(findNotRepeat('aaagaaaaabbbbbbbbbhbbbbsssssdssswwwwwwf'))