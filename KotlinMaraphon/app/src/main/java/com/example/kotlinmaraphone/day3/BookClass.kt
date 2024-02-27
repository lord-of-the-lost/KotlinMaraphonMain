package com.example.kotlinmaraphone.day3

class Book(
    val title: String = "Unknown",
    val author: String = "Anonymous",
    val yearPublished: Int = 2024
) {
//    val title: String = "The Wolf of Wall Street"
//    val author: String = "Jordan Belfort"
//    val yearPublished: Int = 2007
}

fun main() {
    val myBook = Book()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)

    val customBook = Book("The Wolf of Wall Street", "Jordan Belfort", 2007)
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)
}
