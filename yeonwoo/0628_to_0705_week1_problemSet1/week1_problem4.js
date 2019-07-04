function sum(array) {
    let num = 0
    for ( let i = 0 ; i < array.length ; i++ ){
        num = num + array[i]
    }
    return num
}

console.log(sum([1, 2, 3, 4, 5, 6]))