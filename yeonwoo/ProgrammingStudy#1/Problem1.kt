package reactive

import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import io.reactivex.rxkotlin.toObservable
import io.reactivex.rxkotlin.zipWith
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit

fun startWithIt() {
    println("startWith Iterator")
    Observable.range(5, 10)
            .startWith(listOf(1, 2, 3, 4))
            .subscribe { println("Received $it") }

    println("startWith another source Producer")
    Observable.range(5, 10)
            .startWith(Observable.just(1, 2, 3, 4))
            .subscribe { println("Received $it") }
}

fun zip() {
    val observable1 = Observable.range(1, 10)
    val observable2 = Observable.range(10, 11)
    Observable.zip(observable1, observable2, BiFunction<Int, Int, Int> {
        e1, e2 -> e1 + e2
    }).subscribe { println("Received $it") }
}

fun zipWith() {
    val observable1 = Observable.range(1, 10)
    val observable2 = listOf("String 1", "String 2", "String 3", "String 4", "String 5", "String 6", "String 7", "String 8", "String 9", "String 10").toObservable()

    observable1.zipWith(observable2)
    { e1: Int, e2: String -> "$e2 $e1" }.subscribe { println("Received $it") }
}

fun combineLatest() {
    val observable1 = Observable.interval(100, TimeUnit.MILLISECONDS)
    val observable2 = Observable.interval(200, TimeUnit.MILLISECONDS)

    Observable.combineLatest(observable1, observable2, BiFunction {
        t1: Long, t2: Long -> "t1: $t1, t2: $t2"
    }).subscribe { println("Received $it") }

    runBlocking { delay(1100) }
}

fun merge() {
    val observable1 = listOf("Kotlin", "Scala", "Groovy").toObservable()
    val observable2 = listOf("Python", "Java", "C++", "C").toObservable()

    Observable.merge(observable1, observable2)
            .subscribe { println("Received $it") }
}

fun merge2() {
    val observable1 = Observable.interval(500, TimeUnit.MILLISECONDS).map { "Observable 1 $it" }
    val observable2 = Observable.interval(100, TimeUnit.MILLISECONDS).map { "Observable 2 $it" }

    Observable.merge(observable1, observable2)
            .subscribe { println("Received $it") }

    runBlocking { delay(1500) }
}

fun concat() {
    val observable1 = Observable.interval(500, TimeUnit.MILLISECONDS)
            .take(2).map { "Observable 1 $it" }
    val observable2 = Observable.interval(100, TimeUnit.MILLISECONDS).map { "Observable 2 $it" }

    Observable.concat(observable1, observable2)
            .subscribe { println("Received $it") }

    runBlocking { delay(1500) }
}

fun main() {
    concat()
}