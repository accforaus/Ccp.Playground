/*
Write a function which accepts an argument and returns the type.

function getType(value) {
    // body
}

console.log(getType(1)) // output 'number'
console.log(getType('')) // output 'string'
console.log(getType()) // output 'undefined'
console.log(getType([])) // output 'object'
 */

import java.util.Scanner
import kotlin.reflect.jvm.internal.impl.types.DynamicType

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    val numArray = arrayListOf<Int>()

    val myString = " asdf"
    val myDouble = 0.023
    val myUndef = null
    val myInt = 5

    getType(myString)
    getType(myInt)
    getType(myDouble)
    getType(myUndef)
    getType(myObject)

}

object myObject {

}

fun getType(value: Any?) {
    when(value) {
        is String -> println("string")
        is Int -> println("number")
        is Double -> println("number")
        is Object -> println("object")
        else -> println("undefined")
    }
}