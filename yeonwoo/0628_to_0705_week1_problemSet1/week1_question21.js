function extract(str) {
    let array = str.split('')
    let result = ''
    for ( let i = 0 ; i < array.length ; i++) {
        let former = array[i]
        for ( let j = i+1 ; j < array.length ; j++ ) {
            if ( array[j] === former) {
                array.splice(j,1)
            }
        }
        result += array[i]
    }
    return result
}

console.log(extract('thequickbrownfoxjumpsoverthelazydog'))