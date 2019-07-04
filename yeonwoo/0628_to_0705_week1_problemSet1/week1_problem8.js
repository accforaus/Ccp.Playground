function reverse(num) {
    arr = []
    arr1 = []
    for ( let i = num ; i > -1 ; i --){
        let exponent = Math.pow(10,i)
        if ( num / exponent >= 1 ) {
            arr.push(parseInt( num / exponent))
            num = num - Math.pow(10,i) * parseInt( num / exponent)
        }
    }
    let result = ''
    for ( let j = arr.length-1 ; j >= 0 ; j-- ) {
        arr1.push(arr[j])
        result += arr[j]
    }
    return result
}

console.log(reverse(32243))