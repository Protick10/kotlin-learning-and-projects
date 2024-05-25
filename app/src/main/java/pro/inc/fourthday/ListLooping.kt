package pro.inc.fourthday

fun main(){

    val numbers = mutableListOf(1,2,3,4,5)

    for ( item in 0 until numbers.size){
        numbers[item] = numbers[item] * 2
        println(numbers[item])
    }
}