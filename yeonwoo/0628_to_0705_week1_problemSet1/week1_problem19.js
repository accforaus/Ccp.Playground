function amountToCoins(value, array) {
    for ( let j = 0 ; j < array.length ; j++) {
        let maximum = j
        for ( let k = j+1 ; k < array.length ; k++) {
            if ( array[maximum] <= array[k]) {
                maximum = k
            }
        }
        let temp = array[maximum]
        array[maximum] = array[j]
        array[j] = temp
    }
    let array1 = []
    let t = 1
    for ( let i = 0 ; i < array.length ; i++ ) {
        array1.push(parseInt(value/array[i]))
        value = value - (array[i])*(parseInt((value/array[i])))
    }
    let result = ''
    for ( let m = 0 ; m < array1.length ; m++){
        while (array1[m]>0) {
            result += array[m]+' '
            array1[m] = array1[m] -1
        }
    }
    return result
}

console.log(amountToCoins(46, [25, 10, 5, 2, 1]))