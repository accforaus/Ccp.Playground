function getElementByCountFromLast(array, count) {
    let array1 = []
    if(count == undefined) {
        return array[array.length-1]
    }
    if(count > 0 && count < array.length+1){
        for(let i = count; i > 0; i--) {
            array1.push(array[array.length-i])
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

console.log(getElementByCountFromLast([7, 9, 0, -2]))
console.log(getElementByCountFromLast([7, 9, 0, -2], 3))
console.log(getElementByCountFromLast([7, 9, 0, -2], 6))