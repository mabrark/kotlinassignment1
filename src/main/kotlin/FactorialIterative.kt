package org.example

fun factorialIterative(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}