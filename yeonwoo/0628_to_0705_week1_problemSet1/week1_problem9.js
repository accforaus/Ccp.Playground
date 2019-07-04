function palindrome(str) {
    let arr = str.split('')
    for ( let i = 0 ; i < arr.length ; i++) {
        if ( arr[i] === arr[arr.length-i-1] ){
            return "true"
        } else return "false"
    }
}

console.log(palindrome('토마토'))
console.log(palindrome('비글왈!'))