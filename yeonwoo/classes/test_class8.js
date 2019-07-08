class Phone {
    constructor(name, tel) {
        this.name = name
        this.tel = tel
    }

    toString () {
        return `이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>${this.name} ${this.tel}`
    }
}

class Phonebook {
    constructor() {
        this.phoneBooks = []
    }

    addPhoneInfo (phone) {
        this.phoneBooks.push(phone)

    }

    getPhoneInfo (index) {
        return this.phoneBooks[index]
    }

    confirmSavedInfo () {
        let a = ''
        for (let i = 0; i < this.phoneBooks.length; i++) {
            a += `${this.phoneBooks[i].toString()}\n`
        }
        return `인원수>>${this.phoneBooks.length}\n${a}\n저장되었습니다...`
    }

    findMyName (name) {
        let checkString = `검색할 이름>>${name}\n`
        let checkArray = []
        if (name === `그만`) {
            return checkString
        }
        for (let i = 0; i<this.phoneBooks.length; i++) {
            if (this.phoneBooks[i].name === name){
                checkString += `${name}의 번호는 ${this.phoneBooks[i].tel} 입니다.`
                checkArray.push(i)
            }
        }
        if (checkArray.length === 0) {
            return `${checkString}${name} 이 없습니다.`
        } else return checkString

    }
}


phoneHwang = new Phone('황기태', '777-7777')
phoneNa = new Phone('나명품', '999-9999')
phoneChoi = new Phone('최자바', '333-1234')

console.log(phoneHwang.name)

const newPhonebook = new Phonebook()
newPhonebook.addPhoneInfo(phoneHwang)
newPhonebook.addPhoneInfo(phoneNa)
newPhonebook.addPhoneInfo(phoneChoi)

console.log(newPhonebook.getPhoneInfo(0).name)
console.log(newPhonebook.confirmSavedInfo())
console.log(newPhonebook.findMyName('황기순'))
console.log(newPhonebook.findMyName('최자바'))
console.log(newPhonebook.findMyName('그만'))