function findLongestSubstring(str) {
    let arr = str.split('')
    let arr1 = []
    for ( let i = arr.length-2 ; i >= 0 ; i--) {
        for ( let j = i-1 ; j >=0 ; j--) {
            if ( arr[i] === arr[j] ) {
                arr1.push(j)
            }
        }
    } // arr에서 중복되는 index 추출 => arr1으로

    for ( let j = 0 ; j < arr1.length ; j++) {
        let maximum = j
        for (let k = j + 1; k < arr1.length; k++) {
            if (arr1[maximum] <= arr1[k]) {
                maximum = k
            }
        }
        let temp = arr1[maximum]
        arr1[maximum] = arr1[j]
        arr1[j] = temp
    } // arr1 내림차순

    for ( let n = arr1.length-1 ; n >=0 ; n--) {
        for ( let l = n-1 ; l >=0 ; l--) {
            if (arr1[l]===arr1[n]) {
                arr1.splice(n,1)
            }
        }
    } //arr1 중복 제거

    let result = ''
    for ( let k = 0 ; k < arr1.length ; k++) {
        arr.splice(arr1[k],1)
    }
    for ( let m = 0 ; m< arr.length ; m++){
        result += arr[m]
    }
    return result
} // arr1 에 등록된 index로 arr splicing

console.log(findLongestSubstring('google.com'))

console.log(findLongestSubstring('example.com'))