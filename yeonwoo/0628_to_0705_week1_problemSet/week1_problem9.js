function sort (arr){
    for (let i = 0; i<arr.length; i++){
        let minimum = i
        for (let j = i+1; j < arr.length; j++){
            if (arr[minimum] > arr[j]) {
                minimum = j
            }
        }
        let temp = arr[minimum]
        arr[minimum] = arr[i]
        arr[i] = temp
    }
    return arr[arr.length-1]
}

console.log(sort([20, 1, 40, 30, 66, 33]))