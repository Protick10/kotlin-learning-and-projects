package pro.inc.thirdday

data class CoffeeDetails(val name : String,
                         val sugerCount : Int,
                         val size : Int,
                         val creamAmount : Int)

fun main(){

    val coffeeForMe = CoffeeDetails("immy", 4, 2, 1)


    makeCoffee(coffeeForMe)


//    makeCoffee("immy",4)
//    makeCoffee("roy",0)
//    makeCoffee("jason",1)
//
//    println("enter number1: ")
//    val num1 = readLine()!!.toInt()
//    println("enter number2: ")
//    val num2 = readLine()!!.toInt()
//
//    val sum = add(num1, num2)
//    println("Sum is $sum")
}

fun makeCoffee(coffeeDetails: CoffeeDetails){

    if (coffeeDetails.sugerCount==0){
        println("Making coffee without sugar for ${coffeeDetails.name}")}
    else if (coffeeDetails.sugerCount==1){
        println("Making coffee with ${coffeeDetails.sugerCount} spoon of sugar for ${coffeeDetails.name}")
    }
    else{
        println("Making coffee with ${coffeeDetails.sugerCount} spoons of sugar for ${coffeeDetails.name}")
    }




//function to make coffee
//fun makeCoffee(){
//    println("Making coffee")
//    println("Boiling water")
//    println("Grinding coffee beans")
//    println("Mixing water and coffee")
//    println("Coffee is ready")
//}

//fun makeCoffee(name : String, sugerCount : Int){
//
//    if (sugerCount==0){
//        println("Making coffee without sugar for $name")}
//    else if (sugerCount==1){
//        println("Making coffee with $sugerCount spoon of sugar for $name")
//    }
//    else{
//        println("Making coffee with $sugerCount spoons of sugar for $name")
//    }
//    else{
//        println("Making coffee with $sugerCount spoons of sugar")
//    }
//    println("coffee is ready with $sugerCount spoons of sugar")
}


// function with return type..

fun add(num1 : Int, num2 : Int) : Int{
    return num1+num2
}