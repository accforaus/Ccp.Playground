const Response = require('../protocol/response');
const userData = require('../../data/users');

class Server {
    constructor () {
        this.code = 0;
        this.result = {}
        this.user= userData
    }

    readIndex (request) {
        if (request.header.type !== 'GET') {
            this.code = 405;
            return this.createResponse(this.code, this.result)
        }
        if (this.checkRequestForm(request) === 'error') {
            this.code = 400;
            return this.createResponse(this.code, this.result)
        }
        if (this.user[request.payload.data] === undefined ){
            this.code = 404;
            return this.createResponse(this.code, this.result)
        } else {
            this.code = 200;
            this.result = this.user[request.payload.data];
            return this.createResponse(this.code, this.result)
        }
    }

    deleteIndex (request) {
        let newIndex = (request.payload.data * -1) - 1;
        if (request.header.type !== 'GET' && request.header.type !== 'POST') {
            this.code = 405;
            return this.createResponse(this.code, this.result)
        }
        if (this.checkRequestForm(request) === 'error') {
            this.code = 400;
            return this.createResponse(this.code, this.result)
        } else if (newIndex >= this.user.length || newIndex < 0) {
            this.code = 404;
            return this.createResponse(this.code, this.result)
        } else if (newIndex < this.user.length && newIndex >= 0) {
            this.code = 200;
            this.result = this.user[newIndex];
            this.user.splice(newIndex,1)
            return this.createResponse(this.code, this.result)
        }
    }

    findBySomeKey(request, key) {
        if (request.header.type !== 'POST') {
            this.code = 405;
            return this.createResponse(this.code, this.result)
        }
        if (this.checkRequestForm(request) === 'error') {
            this.code = 400;
            return this.createResponse(this.code, this.result)
        }
        if (this.findInUsersArray(request.payload.data, key) === undefined ){
            this.code = 404;
            return this.createResponse(this.code, this.result)
        } else {
            this.code = 200;
            let index = this.findIndexInUsersArray(request.payload.data, key);
            this.result = this.user[index];
            return this.createResponse(this.code, this.result)
        }
    }

    findByName (request) {
        return this.findBySomeKey(request,'name')
    }

    findByLocation (request) {
        return this.findBySomeKey(request,'location')
    }

    findByEmail (request) {
        return this.findBySomeKey(request,'email')
    }

    findByPhone (request) {
        return this.findBySomeKey(request,'phone')
    }

    findByCell (request) {
        return this.findBySomeKey(request,'cell')
    }

    findByGender (request) {
        return this.findBySomeKey(request,'gender')
    }

    createNewObj (request) {
        if (request.header.type !== 'POST') {
            this.code = 405;
            return this.createResponse(this.code, this.result)
        } else if (this.checkRequestForm(request) === 'error') {
            this.code = 400;
            return this.createResponse(this.code, this.result)
        } else {
            this.code = 200;
            this.user.push(request.payload.data);
            this.result = this.user[this.user.length-1];
            return this.createResponse(this.code, this.result)
        }
    }

    updateObj (request) {
        if (request.header.type !== 'POST') {
            this.code = 405;
            return this.createResponse(this.code, this.result)
        }
        if (this.checkRequestForm(request) === 'error') {
            this.code = 400;
            return this.createResponse(this.code, this.result)
        }
        if (request.payload.data['index'] === undefined) {
            this.code = 404;
            return this.createResponse(this.code, this.result)
        } else {
            this.code = 200;
            this.result = this.updateUser(request);
            return this.createResponse(this.code, this.result)
        }
    }

    createResponse (code, results) {
        let response = new Response();
        return response.makeResponse(code, results)
    }

    findInUsersArray (input, key) {
        let saveData = {}
        for (let p in input) {
            for (let q = 0; q < this.user.length; q++) {
                if (input[p] === this.user[q][key]) {
                    saveData = this.user[q]
                    return saveData
                } else if (typeof (input[p]) === 'object') {
                    if ( this.checkObjectIsSameOrNot(input[p], this.user[q][key])) {
                        saveData = this.user[q]
                        return saveData
                    } else {
                        for (let r in input[p]){
                            if( typeof (input[p][r]) === 'object') {
                                if (this.checkObjectIsSameOrNot(input[p][r], this.user[q][key][r])) {
                                    saveData = this.user[q]
                                    return saveData
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    checkObjectIsSameOrNot( obj1, obj2 ) {
        if (obj1 === obj2) return true;
        if (!(obj1 instanceof Object) || !(obj2 instanceof Object)) return false;
        if (obj1.constructor !== obj2.constructor) return false;
        for (let p in obj1) {
            if (!obj1.hasOwnProperty(p)) continue;
            if (!obj2.hasOwnProperty(p)) return false;
            if (obj1[p] === obj2[p]) continue;
            if (typeof (obj1[p]) !== "object") return false;
            if (!this.checkObjectIsSameOrNot(obj1[p], obj2[p])) return false;
        }
        for (let p in obj2) {
            if (obj2.hasOwnProperty(p) && !obj1.hasOwnProperty(p)) return false;
        }
        return true;
    }

    findIndexInUsersArray (input, key) {
        let saveIndex = 0
        for (let p in input) {
            for (let q = 0; q < this.user.length; q++) {
                if (input[p] === this.user[q][key]) {
                    saveIndex = q
                    return saveIndex
                } else if (typeof (input[p]) === 'object') {
                    if ( this.checkObjectIsSameOrNot(input[p], this.user[q][key])) {
                        saveIndex = q
                        return saveIndex
                    } else {
                        for (let r in input[p]){
                            if( typeof (input[p][r]) === 'object') {
                                if (this.checkObjectIsSameOrNot(input[p][r], this.user[q][key][r])) {
                                    saveIndex = q
                                    return saveIndex
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    checkRequestForm (req) {
        let key1 = ['header', 'payload'];
        let key2 = ['type', 'accepts', 'user_agent', 'date', 'host'];
        let key3 = ['data'];
        let firstArr = Object.keys(req);
        let checkNum = 0;
        let checkNum1 = 0;
        for (let i = 0; i < firstArr.length; i++) {
            for (let j = 0; j < key1.length; j++) {
                if (firstArr[i] === key1[j]) {
                    checkNum += i+1;
                    checkNum1 += j+1;
                }
            }
        }
        let checkNum2 = 0;
        let checkNum3 = 0;
        let secondArr = Object.keys(req[firstArr[0]]);
        if (secondArr.length === 5) {
            for (let i = 0; i < key2.length; i++) {
                for (let j = 0; j < secondArr.length; j++) {
                    if (key2[i] === secondArr[j]) {
                        checkNum2 += i+1;
                        checkNum3 += j+1;
                    }
                }
            }
        } else  return 'error';
        let checkNum4 = 0;
        let checkNum5 = 0;
        let thirdArr = Object.keys(req[firstArr[1]]);
        for (let i = 0; i < key3.length; i++) {
            for (let j = 0; j < thirdArr.length; j++){
                if (key3[i] === thirdArr[j]) {
                    checkNum4 += i+1;
                    checkNum5 += j+1;
                }
            }
        }
        if (checkNum === 3 && checkNum1 === 3 && checkNum2 === 15 && checkNum3 === 15 && checkNum4 === 1 && checkNum5 === 1 ) {
            return 'OK'
        } else  return 'error'
    }

    updateUser (obj) {
        let updatedIndex = obj.payload.data['index'];
        delete obj.payload.data['index'];
        let keyArr = Object.keys(obj.payload.data);
        let valueArr = Object.values(obj.payload.data);
        for (let i = 0; i < keyArr.length; i++) {
            this.user[updatedIndex][keyArr[i]] = valueArr[i]
        }
        return this.user[updatedIndex]
    }

}

module.exports = Server