package com.example.kotlinbasics

fun main(){
    println("Please enter your a  number")
    var inputString = readln();
    var inputNumber = inputString!!.toInt()
    val multiplyer = 5

    val result = inputNumber * multiplyer

    println("The result of $inputNumber multiplied by $multiplyer is $result")
}