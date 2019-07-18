function getCurrentTime () {
    let today = new Date()
    let week = new Array('Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat')
    let month = new Array('Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec')
    return `${week[today.getDay()]}, ${today.getDate()} ${month[today.getMonth()]} ${today.getFullYear()} ${today.getHours()}:${today.getMinutes()}:${today.getSeconds()} GMT`
}

module.exports = getCurrentTime