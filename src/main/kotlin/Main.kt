package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("====== Kotlin Assignment 1 =====")

    val maxNumber = 10
    val sumResult = sumUpTo(maxNumber)
    println("Sum of number from 1 to $maxNumber is: $maxNumber")

    val number = 5
    val factorialIterativeResult = factorialIterative(number)
    println("Iterative factorial of $number is: $factorialIterativeResult")

    val factorialLambdaResult = factorialLambda(number)
    println("Lambda factorial of $number is $factorialLambdaResult")

    val factorialRecursiveResult = factorialRecursive(number)
    println("Recursive factorial $number is: $factorialRecursiveResult ")
}