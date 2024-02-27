package com.example.kotlinmaraphone.day3

fun main() {

    // Call Function

    makeCoffee(0, "Rita")

    makeCoffee(1, "la Guerta")

    makeCoffee(2, "Debra")

    makeCoffee(30, "Dexter")

}


// Define Function

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name")
    } else if (sugarCount == 0) {
        println("Coffee with no sugar for $name")
    } else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}