package com.example.kotlinmaraphone.day2

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors") {
        println("Rock, Paper or Scissors? Enter your choice!")
        playerChoice = readln().lowercase()
    }

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> computerChoice = "rock"
        2 -> computerChoice = "paper"
        3 -> computerChoice = "scissors"
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's tie")
    } else {
        println("$winner won!")
    }
}