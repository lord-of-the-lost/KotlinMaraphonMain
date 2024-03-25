package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An Android Watch"),
        Wish(title = "Airpods Max", description = "Apple headphones"),
        Wish(title = "Macbook Pro 14", description = "configuration: 32/1024"),
    )
}