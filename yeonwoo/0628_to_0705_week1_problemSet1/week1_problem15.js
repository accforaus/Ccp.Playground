function isPrime(num) {
    let arr = []
    for ( let i = 2 ; i < num; i++){
        if ( num % i != 0){
            arr.push(i)
        }
    }
    if (arr.length === num-2) {
        return "Prime"
    }else return "notPrime"
}

console.log(isPrime(9))
console.log(isPrime(13))