package com.example.kotlinmaraphone.day3

fun main() {
    var firstNumber: Int? = null
    while (firstNumber == null) {
        println("Enter first number:")
        firstNumber = readlnOrNull()?.toIntOrNull()
    }

    var secondNumber: Int? = null
    while (secondNumber == null) {
        println("Enter second number:")
        secondNumber = readlnOrNull()?.toIntOrNull()
    }

    val result = add(firstNumber, secondNumber)
    println("The result of $firstNumber + $secondNumber is: $result")

}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}