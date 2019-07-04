function findDivisor(num) {
    let arr = []
    for ( let i = 1 ; i <num+1 ; i++) {
        if ( num % i === 0) {
            arr.push(i)
        }
    }
    return arr
}

function findPerfectNumberByRange(x, y) {
    let arr1 = []
    let arr2 = []
    let totalNumber = 0
    for ( let i = x ; i < y+1 ; i++) {
        arr1 = findDivisor(i)
        t = arr1.length
        let total = 0
        for ( let j = 0 ; j <t-1 ; j++) {
            total += arr1[j]
            if ( arr1[t-1] === total ) {
                arr2.push(total)
            }
        }
    }
    return arr2
}

console.log(findPerfectNumberByRange(1, 500))