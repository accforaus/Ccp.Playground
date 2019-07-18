const getCurrentTime = require('../../function/get_current_time')
const checkTypeOf = require('../../function/check_type_of')

class Response {
    constructor () {
        this.header = {}
        this.payload = {}
    }
    result (code, results) {
        this.header.server = 'Node.js'
        this.header.code = code
        this.header.date = getCurrentTime()
        this.header.host = 'local host'
        this.header.content_length = Object.keys(results).length // byte로 나타내는 함수로 바꿔 나중에
        this.header.content_type = checkTypeOf(results)
        this.payload.results = results
        return {'header' : this.header, 'payload' : this.payload}
    }
}

module.exports = Response
