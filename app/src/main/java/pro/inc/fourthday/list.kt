package pro.inc.fourthday

fun main(){


    //immutable list

    val shoppingList = listOf("Processor", "Motherboard", "RAM", "Graphics Card", "Power Supply", "Storage")

    //mutable list

    val shoppingListMutable = mutableListOf("Processor", "Motherboard", "RAM", "Graphics Card", "Power Supply", "Storage")

    //add item to mutable list
    shoppingListMutable.add("Cooling Fan")
    shoppingListMutable.remove("Cooling Fan")

    println(shoppingListMutable)

    shoppingListMutable.set(5, "SSD")
    println(shoppingListMutable)

    val hasram = shoppingListMutable.contains("RAM")

    if (hasram){
        println("You have RAM in your shopping list")}
    else{
        println("You don't have RAM in your shopping list")
    }


    for (item in shoppingListMutable){
        println(item)

        if (item == "RAM"){
            break
        }
    }
}