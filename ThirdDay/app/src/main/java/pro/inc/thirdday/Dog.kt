package pro.inc.thirdday

class Dog(val name: String, val breed: String, var age: Int = 0) { //default value of age is 0

    init {

        bark()

    }

    fun bark(){
        println("woof woof")
    }
}