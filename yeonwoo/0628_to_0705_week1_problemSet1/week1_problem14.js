function numOfVowels(str) {
    let arr1 = str.split(' ')
    for ( let i = 0 ; i < arr1.length ; i++){
        arr1[i] = arr1[i].length
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
    return arr1[arr1.length-1]
}


console.log(numOfVowels('The quick brown fox'))