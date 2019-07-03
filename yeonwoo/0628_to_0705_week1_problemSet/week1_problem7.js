function createArrayByChar(startRange, endRange, count) {
    let array = []
    let str = []
    for (let i=startRange.charCodeAt(0); i<endRange.charCodeAt(0)+1; i++){
        if ((i-startRange.charCodeAt(0))%count === 0) {
            str.push(i)
        }
    }
    for (let j = 0; j< str.length; j++){
        array.push(String.fromCharCode(str[j]))
    }
    return array
}

console.log(createArrayByChar('a', 'z', 2))

