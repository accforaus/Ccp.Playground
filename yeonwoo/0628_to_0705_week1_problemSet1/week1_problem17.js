function find(array) {
    for ( let j = 0 ; j < array.length ; j++) {
        let minimum = j
        for ( let k = j+1 ; k < array.length ; k++) {
            if ( array[minimum] >= array[k]) {
                minimum = k
            }
        }
        let temp = array[minimum]
        array[minimum] = array[j]
        array[j] = temp
    }
    return `${array[1]} , ${array[array.length-2]}`
}

console.log(find([1, 2, 3, 4, 5]))