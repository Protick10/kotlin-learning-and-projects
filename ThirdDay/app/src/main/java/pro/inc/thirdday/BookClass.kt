package pro.inc.thirdday

class Book( val author : String = "Anonymus", val title : String = "Unknown", val year : Int = 2024) { //default value of year is 0

    init {

        read()

    }

    fun read(){
        println("Reading $title by $author")
    }
}


fun main(){

    var myBook = Book()

    println(myBook)

    var myBook2 = Book("J.K. Rowling", "Harry Potter", 1997)

    println(myBook2.author)

    println(myBook2.title)

    println(myBook2.year)
}