function findPairIndexByTarget(target) {
    const numbers = [10, 20, 10, 40, 50, 60, 70]
    let array = []
    for (let i = 0; i < numbers.length ; i++){
        for ( let j = 0; j < numbers.length; j++){
            if (i !== j && numbers[i] + numbers[j] === target) {
                array = [i, j]
            }
        }
    }
    return array
}

console.log(findPairIndexByTarget(50))
console.log(findPairIndexByTarget(60))
console.log(findPairIndexByTarget(25))