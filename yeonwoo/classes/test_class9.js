class Dictionary {
    constructor(korean, english) {
        this.koreanWords = korean
        this.englishWords = english
    }

    kor2eng (word) {
        for (let i = 0; i < this.koreanWords.length; i++) {
            if (this.koreanWords[i] === word) return `${word}는 ${this.englishWords[i]} 입니다.`
        }
        return "없는 단어 입니다."
    }

    translation (word) {
        let checkArray = []
        for (let i = 0; i < this.koreanWords.length; i++ ) {
            if ( word === this.koreanWords[i] ) {
                checkArray.push(i)
                return `${this.koreanWords[i]}은 ${this.englishWords[i]}`
            }
        }
        if (checkArray.length === 0) {
            return `${word}는 저의 사전에 없습니다.`
        }
    }

}



const myDictionary = new Dictionary(["사랑", "아기", "돈", "미래", "희망"],["love", "baby", "money", "future", "hope"])
console.log(myDictionary.translation("희망"))
console.log(myDictionary.translation("아가"))
console.log(myDictionary.translation("아기"))
console.log(myDictionary.kor2eng("희망"))
console.log(myDictionary.kor2eng("아가"))
console.log(myDictionary.kor2eng("아기"))

