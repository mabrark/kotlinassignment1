package org.example

fun sumUpTo(max: Int): Int {
    var sum = 0
    for (i in 1..max) {
        sum += i
    }
    return sum
}