package com.example.kotlinbasics

fun main(){

    var age = 0;
    println("Enter your age as a whole number")

    var enteredage = readLine()
    age = enteredage!!.toInt()


    if (age in 18..40) {
        println("You can enter the club")
    }

    else if (age >= 41) {
        println("You are too old for the club, please go home")
    }

    else {
        println("Age not verified. Please contact support.")
    }
}