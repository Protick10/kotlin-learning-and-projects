package com.example.kotlinbasics

fun main(){
    println("Hello World!")
    println("i am learning kotlin")

    val a = 10 // val is used to declare a variable which is immutable (read-only) and cannot be changed once assigned.
    var b = 20 // var is used to declare a variable which is mutable and can be changed later in the program.

    println("a = $a")

    println("b = $b") // String interpolation
    b = 30
    println("the changed value of b = $b")

    val c =10.5

    println(c)



    var count = 0

    while (count < 5){
        println("count = $count")
        count++
    }

    var userinput = readln()

    while (userinput == "1"){
        println("You entered 1")
        userinput = readln()
    }
    println("loop ended")


}
