const cacio = require('./src/transfer/cacio')
const Server = require("./src/server/server")
const user = require('./data/users')

let nameData = {"name": {
        "title": "ms",
        "first": "nikoline",
        "last": "gravdal"
    }
}

let locationData = {
    "location": {
        "street": "9800 rua são josé ",
        "city": "castanhal",
        "state": "mato grosso",
        "postcode": 22222,
        "coordinates": {
            "latitude": "-78.8935",
            "longitude": "107.8776"
        }
    }
}

let emailData = {"email": "veridiano.silva@example.com"}
let phoneData = {"phone": "(23) 0813-5448"}
let cellData = {"cell": "(94) 5533-3728"}
let genderData = {"gender": "female"}
let newData = {
    "gender": "female",
    "name": {
        "title": "wtf",
        "first": "yeonwoo",
        "last": "choi"
    },
    "location": {
        "street": "217 Yuyeon-ro",
        "city": "Jeonju-si",
        "state": "Jeollabuk-do",
        "postcode": 54955,
        "coordinates": {
            "latitude": "35.8262841",
            "longitude": "127.10792509999999"
        },
        "timezone": {
            "offset": "+9:00",
            "description": "blabla"
        }
    },
    "email": "rud527@naver.com",
    "login": {
        "uuid": "7fa4fc36-2276-4941-94f0-3d3ec3a9d8c6",
        "username": "beagle123",
        "password": "walwalwal1",
        "salt": "iExLrees",
        "md5": "3180db955b12234787fdee0a865a77a1",
        "sha1": "b0bdd185dae3bfcd4d3419c51af513bfc7d4e7c8",
        "sha256": "d1769994f7366425531d2d444296910fa18f99e8e80db702bf8f1699c174bfda"
    },
    "dob": {
        "date": "1956-06-15T13:35:33Z",
        "age": 63
    },
    "registered": {
        "date": "2017-01-20T19:25:46Z",
        "age": 24
    },
    "phone": "(26) 6857-4951",
    "cell": "(56) 4606-6441",
    "id": {
        "name": "",
        "value": null
    },
    "picture": {
        "large": "https://randomuser.me/api/portraits/women/72.jpg",
        "medium": "https://randomuser.me/api/portraits/med/women/72.jpg",
        "thumbnail": "https://randomuser.me/api/portraits/thumb/women/72.jpg"
    },
    "nat": "BR"
}

let newData2 = newData
newData2.index = 1

const cacio1 = new cacio()
const result1 = cacio1.get('/user/1')
const result2 = cacio1.post('/user/findByName', nameData)
const result3 = cacio1.post('/user/findByLocation', locationData)
const result4 = cacio1.post('/user/findByEmail', emailData)
const result5 = cacio1.post('/user/findByPhone', phoneData)
const result6 = cacio1.post('/user/findByCell', cellData)
const result7 = cacio1.post('/user/findByGender', genderData)
const result8 = cacio1.get('/user/delete/10')
const result9 = cacio1.get('/user/delete/5101')
const result10 = cacio1.post('/user/createNewObj', newData)
const result11 = cacio1.post('/user/updateObj', newData2)
const result12 = cacio1.post('/user/findByName', {'name' : 'WalWal'})


console.log(result1)
console.log(`----------------------------------------------------------------------------`)
console.log(result2)
console.log(`----------------------------------------------------------------------------`)
console.log(result3)
console.log(`----------------------------------------------------------------------------`)
console.log(result4)
console.log(`----------------------------------------------------------------------------`)
console.log(result5)
console.log(`----------------------------------------------------------------------------`)
console.log(result6)
console.log(`----------------------------------------------------------------------------`)
console.log(result7)
console.log(`----------------------------------------------------------------------------`)
console.log(result8)
console.log(`----------------------------------------------------------------------------`)
console.log(result9)
console.log(`----------------------------------------------------------------------------`)
console.log(result10)
console.log(`----------------------------------------------------------------------------`)
console.log(result11)
console.log(`----------------------------------------------------------------------------`)
console.log(result12)
console.log(`----------------------------------------------------------------------------`)
