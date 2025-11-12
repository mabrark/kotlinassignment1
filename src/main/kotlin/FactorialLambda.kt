package org.example

val factorialLambda: (Int) -> Long = { n ->
    if (n == 0) 1L else (1..n).fold(1L) { acc, i -> acc * i}
}