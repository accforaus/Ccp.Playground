function charCount(str, ch) {
    let arr = str.split('')
    let num = 0
    for ( let i = 0 ; i < arr.length ; i++) {
        if( ch === arr[i] ){
            num += 1
        }
    }
    return num
}

console.log(charCount('ourhours.com', 'o'))