module.exports = {
    request : {
        get : [
            '/user/index',
            '/user/gender',
            '/user/delete/index'
        ],
        post : [
            '/user/findByName',
            '/user/findByLocation',
            '/user/findByEmail',
            '/user/findByPhone',
            '/user/findByCell',
            '/user/findByGender'
        ]
    }
}