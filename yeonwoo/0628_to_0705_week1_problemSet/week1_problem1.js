function checkArray (array) {
    return array instanceof Array
}

console.log(checkArray('yeonwoochoi'))
console.log(checkArray([1, 2, [4, 0]]))