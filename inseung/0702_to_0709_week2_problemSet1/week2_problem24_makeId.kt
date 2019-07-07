/*
Write a function that generates a string id (specified length) of random characters.

function makeId(num) {
    const charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    // body
}

console.log(makeId(8)) // 4SGqCfrz

 */
import java.lang.StringBuilder
import java.util.*

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val length = reader.nextInt()
        if (length <= 0) break

        println(makeId(length))
    }
}


fun makeId (length: Int) : String {
    val charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    val random = Random()
    val Id = StringBuilder()

    for (i in 0..length)
        Id.append(charList[random.nextInt(charList.length)])

    return Id.toString()
}