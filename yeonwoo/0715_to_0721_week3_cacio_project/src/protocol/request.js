const getCurrentTime = require('../../function/get_current_time')
const checkTypeOf = require('../../function/check_type_of')

class Request {
    constructor () {
        this.header = {}
        this.payload = {}
    }
    makeRequest (type, input) {
        this.header.type = type
        this.header.accepts = checkTypeOf(input)
        this.header.user_agent = 'Node.js'
        this.header.date = getCurrentTime()
        this.header.host = 'localhost'
        this.payload.data = input
        return {'header' : this.header, 'payload' : this.payload}
    }
}

module.exports = Request