function range(x, y) {
    let arr = []
    for ( let i = x+1 ; i < y ; i++){
        arr.push(i)
    }
    return arr
}

console.log(range(2, 9))