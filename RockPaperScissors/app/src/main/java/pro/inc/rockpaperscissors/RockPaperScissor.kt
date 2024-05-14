package pro.inc.rockpaperscissors

fun main(){

    var computerChoice = ""
    var userChoice = ""

    println("Enter your choice: Rock, Paper or Scissors")
    userChoice = readLine().toString()

    val random = (1..3).random()

    when(random){
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

//    if (random == 1){
//        computerChoice = "Rock"}
//    else if (random == 2){
//        computerChoice = "Paper"}
//    else if (random == 3){
//        computerChoice = "Scissors"}


    println(computerChoice)

    val winner = when{
        computerChoice == userChoice -> "It's a draw"
        computerChoice == "Rock" && userChoice == "Scissors" -> "Computer wins"
        computerChoice == "Paper" && userChoice == "Rock" -> "Computer wins"
        computerChoice == "Scissors" && userChoice == "Paper" -> "Computer wins"
        else -> "User wins"
    }

    println(winner)
}
