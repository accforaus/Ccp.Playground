function exponent(num) {
    let arr = []
    for ( let i = 2 ; i < num+1 ; i++) {
        let base = i
        for ( let j = 2 ; j < num+1 ; j++ ){
            if (Math.pow( base, j ) === num ) {
                arr.push(j)
                }
            }
        }
    return arr
    }

function Maximumm(array) {
    for ( let i = 0 ; i < array.length ; i++) {
        let minimum = i
        for ( let j = i + 1 ; j < array.length ; j++ ) {
            if ( array[minimum] < array[j] ) {
                minimum = j
            }
        }
        let temp = array[minimum]
        array[minimum] = array[i]
        array[i] = temp
    }
    return array[array.length-1]
}

console.log(Maximumm(exponent(64)))
