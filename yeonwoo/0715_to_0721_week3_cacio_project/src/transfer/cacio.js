const Request = require('../protocol/request')
const Server = require('../server/server')

class Cacio {
    constructor () {
        this.server = new Server()
    }

    get (url) {
        let arr = this.parseUrl(url)
        let urlKeyword = arr[1]
        let request = this.createRequest('GET', urlKeyword)
        let result = {}
        let input1 = 0
        if (typeof(urlKeyword) !== "number") {
            input1 = 400
        } else if (urlKeyword >= 0) {
            result = this.server.readIndex(request)
            input1 = result.header.code
        } else if (urlKeyword < 0) {
            result = this.server.deleteIndex(request)
            input1 = result.header.code
        } else input1 = 500
        if (input1 === 200) return 'OK', result.payload.results
        else if (input1 === 400) return 'BAD Request'
        else if (input1 === 404) return 'Not Found'
        else if (input1 === 405) return 'Method Not Allowed'
        else if (input1 === 500) return 'Internal Server Error'
        else return 'Server Unavailable'
    }

    post (url, obj) {
        let arr = this.parseUrl(url)
        let urlKeyword1 = arr[0][0]
        let urlKeyword2 = arr[0][arr[0].length - 1]
        let request = this.createRequest('POST', obj)
        let result = {}
        if (urlKeyword1 === 'findBy') {
            if (urlKeyword2 === 'Name') result = this.server.findByName(request)
            if (urlKeyword2 === 'Location') result = this.server.findByLocation(request)
            if (urlKeyword2 === 'Email') result = this.server.findByEmail(request)
            if (urlKeyword2 === 'Phone') result = this.server.findByPhone(request)
            if (urlKeyword2 === 'Cell') result = this.server.findByCell(request)
            if (urlKeyword2 === 'Gender') result = this.server.findByGender(request)
        }
        if (urlKeyword1 === 'create') {
            result = this.server.createNewObj(request)
        }
        if (urlKeyword1 === 'update') {
            result = this.server.updateObj(request)
        }
        let input1 = result.header.code
        if (input1 === 200) return 'OK', result.payload.results
        else if (input1 === 400) return 'BAD Request'
        else if (input1 === 404) return 'Not Found'
        else if (input1 === 405) return 'Method Not Allowed'
        else if (input1 === 500) return 'Internal Server Error'
        else return 'Server Unavailable'

    }




    parseUrl (str) {
        let arr = str.split('/');
        let postKeyword = [];
        let getKeyword = '';
        let array = [postKeyword, getKeyword]
        if (arr[2] === 'delete') {
            array[1] = (arr[3] + 1) * -1
        } else if (arr[2] >= 0 && arr[2] < 5000 ) {
            array[1] = parseInt(arr[2])
        } else if (arr[2].substring(0,6) === 'findBy') {
            array[0].push('findBy')
            array[0].push(arr[2].substring(6,arr[2].length))
        } else if (arr[2].substring(0,6) === 'create') {
            array[0].push('create')
        } else if (arr[2].substring(0,6) === 'update') {
            array[0].push('update')
        } else {
            array[0].push('error')
            array[1] = 'error'
        }
        return array
    }

    createRequest (type, payload) {
        let someRequest = new Request()
        return someRequest.makeRequest(type, payload)
    }

}

module.exports = Cacio