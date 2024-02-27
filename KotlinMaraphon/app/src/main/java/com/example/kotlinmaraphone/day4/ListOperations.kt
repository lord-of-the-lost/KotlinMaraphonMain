package com.example.kotlinmaraphone.day4

fun main() {
    val fruitsList = mutableListOf<String>("apple", "banana", "orange", "pear", "pineapple")
    println(fruitsList)
    fruitsList.add("coconut")
    println(fruitsList)
    fruitsList.remove("banana")
    println(fruitsList)
    println("Enter some fruit name:")
    val inputFruit = readln()
    if (fruitsList.contains(inputFruit)) {
        println("This fruit is also contains in fruitsList")
    } else {
        println("This fruit is not contains in fruitsList")
    }
}