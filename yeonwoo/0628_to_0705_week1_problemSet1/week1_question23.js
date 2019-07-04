function biggerElements(val) {
    for (let i = 0 ; i < val.length ; i++) {
        if ( val[i] <= val.length) {
            val.splice(i,1)
        }
    }
    return val
}

console.log(biggerElements([11, 45, 4, 31, 64, 10]))