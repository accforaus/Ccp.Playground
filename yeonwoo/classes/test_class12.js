function read (arr) {
    let str = ''
    for (let i = 0; i < arr.length; i++) {
        str += arr[i]
    }
    return str
}



class Reservation {
    constructor (s,a,b) {
        this.seatLevel = 0
        this.seatNumber = 0
        this.name = ""
        this.s = s
        this.a = a
        this.b = b
    }


    doReservation (seatLevel, seatNumber, name) {
        this.seatLevel = seatLevel
        this.seatNumber = seatNumber
        this.name = name
        if (this.seatLevel === 's') {
            this.s[this.seatNumber-1] = `${this.name} `
            return read(this.s)
        }
        if (this.seatLevel === 'a') {
            this.a[this.seatNumber-1] = `${this.name} `
            return read(this.a)
        }
        if (this.seatLevel === 'b') {
            this.b[this.seatNumber-1] = `${this.name} `
            return read(this.b)
        }
        return `error`
    }

}








class CancelReservation {
    constructor (s, a, b) {
        this.name = ""
        this.s = s
        this.a = a
        this.b = b
    }

    cancelSeat (name) {
        this.name = `${name} `
        for (let i = 0; i < 9; i++) {
            if (this.s[i] === this.name) {
                this.s[i] = `--- `
                return read(this.s)
            }
            if (this.a[i] === this.name) {
                this.a[i] = `--- `
                return read(this.a)
            }
            if (this.b[i] === this.name) {
                this.b[i] = `--- `
                return read(this.b)
            }
        }
        return `error`
    }

}








function lookUpAllSeats (s, a, b) {
    return `${read(s)}\n${read(a)}\n${read(b)}`
}







class totalManager {
    constructor () {
        this.s = [`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `]
        this.a = [`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `]
        this.b = [`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `,`--- `]
        this.reservation = new Reservation(this.s,this.a,this.b)
        this.calcelReserve = new CancelReservation(this.s,this.a,this.b)
        this.seatNumber = 0
        this.seatLevel = 0
        this.name = ""
    }
    totalMenu (menu, name, seatLevel, seatNumber) {
        if (menu === 'reservation') {
            this.seatNumber = seatNumber
            this.seatLevel = seatLevel
            this.name = name
            return this.reservation.doReservation(`${this.seatLevel}`, `${this.seatNumber}`, `${this.name}`)
        }
        if (menu === 'cancel') {
            this.name = name
            return this.calcelReserve.cancelSeat(`${this.name}`)
        }
        if (menu === 'lookup') {
            return lookUpAllSeats(this.s,this.a,this.b)
        }
        return `error`
    }

}


const totalManager1 = new totalManager()
totalManager1.totalMenu('reservation','황인성','s',8)
totalManager1.totalMenu('reservation','이주원','a',4)
totalManager1.totalMenu('reservation','김하늘','b',2)
console.log(totalManager1.totalMenu('lookup'))
console.log(`\n`)

totalManager1.totalMenu('cancel','이주원')
console.log(totalManager1.totalMenu('lookup'))

