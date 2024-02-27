package com.example.kotlinmaraphone.day4

fun main() {
    val myBankAccount = BankAccount("Nikolay", 1300.0)
    println(myBankAccount.accountHolder)
    myBankAccount.withdraw(100.0)
    myBankAccount.deposit(150.0)
    myBankAccount.withdraw(200.0)
    myBankAccount.deposit(1500.0)
    myBankAccount.withdraw(333.15)
    myBankAccount.deposit(1500.78)
    myBankAccount.displayTransactionHistory()
    myBankAccount.acctBalance()

    val newBankAccount = BankAccount("Sarah", 0.0)
    newBankAccount.deposit(100.0)
    newBankAccount.withdraw(10.0)
    newBankAccount.deposit(300.0)
    newBankAccount.displayTransactionHistory()
    newBankAccount.acctBalance()
}