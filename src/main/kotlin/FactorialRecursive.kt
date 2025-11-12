package org.example

fun factorialRecursive(n: Int): Long {
    return if (n <= 1) 1L else n * factorialRecursive(n - 1)
}