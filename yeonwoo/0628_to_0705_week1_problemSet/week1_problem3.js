function getElementByCount(array, count) {
    let array1 = []
    if(count == undefined) {
        return array[0]
    }
    if(count > 0 && count < array.length+1){
        for(let i = 1; i < count+1; i++) {
            array1.push(array[i-1])
        }
        return array1
    }
    if(count>array.length) {
        return array
    }
    if(count<=0){
        return array1
    }
}


console.log(getElementByCount([7, 9, 0, -2]))
console.log(getElementByCount([], 3))
console.log(getElementByCount([7, 9, 0, -2], 3))
console.log(getElementByCount([7, 9, 0, -2], 6))
console.log(getElementByCount([7, 9, 0, -2], -3))
