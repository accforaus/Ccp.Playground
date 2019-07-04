function makeId(num) {
    const charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    let Id = ""
    for ( let i = 0 ; i< 8 ; i++){
        Id = Id + charList.charAt(Math.floor(Math.random(charList) * charList.length ))
    }
    return Id
}

console.log(makeId(8))