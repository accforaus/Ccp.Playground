let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

function printPrimeNumberByArray() {
    let primeArr = []
    let primeNot = []
    for (let i = 1; i <= array.length; i++) {
        let kajji = true
        for (let j = 2; j < i; j++) {
            if (i % j === 0){
                kajji = false
            }
        }
        /**
         * 이게 뭐냐?
         *
         * ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
         */
        if (kajji) {
            primeArr.push(i)
        }else {
            primeNot.push(i)
        }
    }
    for(let t=0;t<primeArr.length; t++) {
        console.log(`${primeArr[t]} => 소수 자노~`)
    }
    for(let m=0;m<primeNot.length; m++)    {
        console.log(`${primeNot[m]} => 소수 아니자노~`)
    }
}

printPrimeNumberByArray()