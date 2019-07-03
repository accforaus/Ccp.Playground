function arrayToString(array, joinStr) {
    let abc = ""
    for (let i=0; i< array.length-1; i++) {
        abc = abc + array[i] + joinStr
    }
    return '"'+ abc + array[array.length-1] + '"'
}

let array = ["봉준호", "김어준", "강신주", "데카르트"]

console.log(arrayToString(array, ","))
console.log(arrayToString(array, " "))
console.log(arrayToString(array, "+"))