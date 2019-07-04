function GCD(num1, num2) {
    let array = []
    for ( let i = 2 ; i < num1 + 1 ; i++) {
        if ( num1 % i === 0 && num2 % i === 0 ) {
            array.push(i)
        }
    }
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
    return array[0]
}


console.log(GCD(380, 500))
console.log(GCD(50, 30))
console.log(GCD(3949350, 4693496))