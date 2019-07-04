function order(str) {
    let arr = str.split("")
    let arr1 = []
    let arr2 = []
    for ( let i = 0 ; i < arr.length ; i++ ) {
        arr1.push(arr[i].charCodeAt(0))
    }
    for ( let j = 0 ; j < arr1.length ; j++) {
        let minimum = j
        for ( let k = j+1 ; k < arr1.length ; k++) {
            if ( arr1[minimum] >= arr1[k]) {
                minimum = k
            }
        }
        let temp = arr1[minimum]
        arr1[minimum] = arr1[j]
        arr1[j] = temp
    }
    let result = ''
    for ( let m = 0 ; m < arr1.length ; m++) {
        arr2[m] = String.fromCharCode(arr1[m])
        result += arr2[m]
    }
    return result
}

console.log(order('webmaster'))