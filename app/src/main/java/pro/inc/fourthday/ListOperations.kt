package pro.inc.fourthday

fun main(){

    val fruitList = mutableListOf("Apple", "Banana", "Orange", "Grapes", "Pineapple")

    fruitList.add("Mango")

    fruitList.remove("Orange")

    val mangocontains = fruitList.contains("Mango")

    if (mangocontains){
        println("You have Mango in your fruit list")}
    else{
        println("You don't have Mango in your fruit list")
    }
}