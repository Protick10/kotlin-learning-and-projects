package pro.inc.thirdday

fun main(){

    //creating object/instance of Dog class
    var maydog = Dog("Tommy", "German Shepherd", 5)  //object of Dog class with name Tommy, breed German Shepherd and age 5


    //accessing properties of Dog class

    println("Name of the dog is ${maydog.name}")
    println("Breed of the dog is ${maydog.breed}")
    println("Age of the dog is ${maydog.age}")

    maydog.age = 6
    println("Age of the dog is ${maydog.age}")


}