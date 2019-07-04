function findLongest(arr) {
    let arr1 = []

    for ( let j = 0 ; j < arr.length ; j++) {
        let maximum = j
        for ( let k = j+1 ; k < arr.length ; k++) {
            if ( arr[maximum].length <= arr[k].length) {
                maximum = k
            }
        }
        let temp = arr[maximum]
        arr[maximum] = arr[j]
        arr[j] = temp
    }
    return arr[0]
}

console.log(findLongest(['Australia', 'Germany', 'Korea', 'United States of America']))