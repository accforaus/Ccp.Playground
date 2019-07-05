function findDivisor(num) {
    let arr = []
    for (let i = 1; i <num+1; i++) {
        if (num % i === 0) arr.push(i)
    }
    return arr
}

module.exports = findDivisor