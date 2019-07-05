/**
 * Write a function to extract unique characters from a string.
 * @param str
 * @returns {string|string}
 */
function extract(str) {
    let array = str.split('')
    let result = ''
    for ( let i = 0 ; i < array.length ; i++) {
        let former = array[i]
        for (let j = array.length - 1; j > i; j--) {
            if (array[j] === former) {
                array.splice(j,1)
            }
        }
        result += array[i]
    }
    return result
}

console.log(extract('thequickbrownfoxjumpsoverthelazydog'))
console.log(extract('ttttttteeeeeeeewwwwwwwwwqqqqqqqqq'))