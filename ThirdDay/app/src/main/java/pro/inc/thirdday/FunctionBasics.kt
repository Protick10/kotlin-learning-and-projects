package pro.inc.thirdday

fun main(){
    makeCoffee("immy",4)
    makeCoffee("roy",0)
    makeCoffee("jason",1)

    println("enter number1: ")
    val num1 = readLine()!!.toInt()
    println("enter number2: ")
    val num2 = readLine()!!.toInt()

    val sum = add(num1, num2)
    println("Sum is $sum")
}


//function to make coffee
//fun makeCoffee(){
//    println("Making coffee")
//    println("Boiling water")
//    println("Grinding coffee beans")
//    println("Mixing water and coffee")
//    println("Coffee is ready")
//}

fun makeCoffee(name : String, sugerCount : Int){

    if (sugerCount==0){
        println("Making coffee without sugar for $name")}
    else if (sugerCount==1){
        println("Making coffee with $sugerCount spoon of sugar for $name")
    }
    else{
        println("Making coffee with $sugerCount spoons of sugar for $name")
    }
//    else{
//        println("Making coffee with $sugerCount spoons of sugar")
//    }
//    println("coffee is ready with $sugerCount spoons of sugar")
}


// function with return type..

fun add(num1 : Int, num2 : Int) : Int{
    return num1+num2
}