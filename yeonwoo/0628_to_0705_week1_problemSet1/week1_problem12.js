function toUpper(str) {
    let arr = str.split("")
    let arr1 = []
    let arr2 = []
    for ( let i = 0 ; i < arr.length ; i++ ) {
        arr1.push(arr[i].charCodeAt(0))
    }
    console.log(arr1)
    for ( let j = 0 ; j < arr1.length ; j++) {
        if (arr1[j] === 32){
            arr1[j+1] -= 32
        }
    }
    console.log(arr1)
    let result = ''
    for ( let m = 0 ; m < arr1.length ; m++) {
        arr2[m] = String.fromCharCode(arr1[m])
        result += arr2[m]
    }
    return result
}

console.log(toUpper('the quick brown fox'))