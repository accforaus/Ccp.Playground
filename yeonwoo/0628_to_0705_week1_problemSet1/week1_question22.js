function occurCount(str) {
    let arr = str.split('')
    for ( let j = 0 ; j < arr.length ; j++) {
        if ( arr[j] === ' '){
            arr.splice(j,1)
        }
    }


    let arr1 = []
    for ( let i = 0 ; i < arr.length ; i++) {
        let tt = arr[i]
        let sth = 0
        for ( let j = 0 ; j < arr.length ; j++) {
            if ( arr[j] === tt ) {
                sth = sth + 1
            }
        }
        arr1.push(`${tt} : ${sth}`)
    }
    for ( let k = 0 ; k < arr1.length ; k++) {
        for ( let m = k+1 ; m < arr1.length ; m++) {
            if ( arr1[k] === arr1[m]){
                arr1.splice(m,1)
            }
        }
    }
    return arr1
}

console.log(occurCount("The quick brown fox jumps over the lazy dog"))