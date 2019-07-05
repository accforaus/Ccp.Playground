function sortFromMinimum (array) {
    for (let i = 0; i < array.length; i++) {
        let minimum = i
        for (let j = i + 1; j < array.length; j++) {
            if (array[minimum] < array[j]) {
                minimum = j
            }
        }
        let temp = array[minimum]
        array[minimum] = array[i]
        array[i] = temp
    }
    return array
}


module.exports = sortFromMinimum

