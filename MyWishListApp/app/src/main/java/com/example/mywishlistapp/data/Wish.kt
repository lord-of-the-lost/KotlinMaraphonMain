package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo("wish-title")
    val title: String = "",
    @ColumnInfo("wish-description")
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An Android Watch"),
        Wish(title = "Airpods Max", description = "Apple headphones"),
        Wish(title = "Macbook Pro 14", description = "configuration: 32/1024"),
    )
}