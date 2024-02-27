package com.example.kotlinmaraphone.day2

fun main() {
    println("Please enter a number:")
    val inputString = readLine()
    val inputNumber = inputString?.toIntOrNull()
    val multiplier = 5
    val result: Int
    if (inputNumber != null) {
        result = inputNumber * multiplier
        println("Result of operation is: $result")
    } else {
        println("Error! You should enter a number")
    }
}