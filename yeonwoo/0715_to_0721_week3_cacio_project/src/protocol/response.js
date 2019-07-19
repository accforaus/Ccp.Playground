const getCurrentTime = require('../../function/get_current_time')
const checkTypeOf = require('../../function/check_type_of')

class Response {
    constructor () {
        this.header = {}
        this.payload = {}
    }
    makeResponse (code, results) {
        this.header.server = 'Node.js'
        this.header.code = code
        this.header.date = getCurrentTime()
        this.header.host = 'local host'
        this.header.content_length = Object.keys(results).length
        this.header.content_type = checkTypeOf(results)
        this.payload.results = results
        return {'header' : this.header, 'payload' : this.payload}
    }
}

module.exports = Response
