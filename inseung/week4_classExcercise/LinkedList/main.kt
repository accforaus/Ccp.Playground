fun main() {
    var list = LinkedList<Int>()

    list.push(10)
    list.push(20)
    println(list.pop()) // output `20`
    println(list.pop()) // output `10`

    list.push(10)
    list.push(20)
    println(list.shift()) // output `10`
    println(list.shift()) // output `20`

    list.unshift(10)
    list.unshift(20)
    println(list.pop()) // output `10`
    println(list.pop()) // output `20`

    list.unshift(10)
    list.unshift(20)
    println(list.shift()) // output `20`
    println(list.shift()) // output `10

    list.push(10)
    list.push(20)
    println(list.pop())

    list.push(30)
    println(list.shift()) // output `10`

    list.unshift(40)
    list.push(50)
    println(list.shift()) // output `40`
    println(list.pop()) // output `50`
    println(list.shift()) // output `30`

    println(list.count)

    list = LinkedList<Int>()

    list.unshift(10)
    list.shift()
    list.push(20)
    println(list.count) // output `1`
    println(list.shift()) // output `20`

    list.push(10)
    list.push(20)
    list.push(30)
    list.delete(20)
    println(list.count) // output `2`
    println(list.pop()) // output `30`
    println(list.shift()) // output `10`
}