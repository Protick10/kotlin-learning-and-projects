package com.example.kotlinbasics

fun main(){

    val constantNumber = 100

    var mutableString = "protick"

    println(constantNumber)
    println(mutableString)

   mutableString = "anik"

   println(mutableString)

//assigning values to different types of variables


    var myAge: Byte = 35
    var mySalary: Int = 100000
    var myHeight: Float = 5.8f
    var myWeight: Double = 75.5
    var isMarried: Boolean = true
    var myName: String = "Protick Saha"

    val myTrue = true
    val myFalse = false


    val myChar = "A"

    println(myChar)

    val myCharUnicode = '\u00AE'
    println(myCharUnicode)

    val str = "Hello, World!"
    val str1 = "Hello, World2!"

    println(str)

    for (char in str) {
        println(char)
    }


    println(str.uppercase())

    println(str + str1)
    println(str.plus(str1))

    println(str + " " + "pro")


    //readln
   println("Enter your age in full years")
   val age = readln().toInt()

    if (age >= 18){

        println("You are eligible to vote")
    }

    else{

        println("You are not eligible to vote")
    }
}