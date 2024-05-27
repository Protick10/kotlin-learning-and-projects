package pro.inc.bankaccountprogram

class BankAccount(var accuntHolder: String,
                  var balance: Double) {


    private val transactionHistory = mutableListOf<String>()  //private property to store transaction history can only be accessed within the class


    fun deposit(amount: Double){

        balance += amount
        transactionHistory.add("$accuntHolder deposited $$amount")

    }

    fun withdraw(amount: Double){

        if (balance >= amount){
            balance -= amount
            transactionHistory.add("$accuntHolder withdrew $$amount")
        }else{
            println("Insufficient funds")
        }

    }

    fun displayTransactionHistory(){
        println("Transaction History for $accuntHolder:")
        for (transaction in transactionHistory){
            println(transaction)
        }

    }


    fun acctBalance(): String {
        return "$accuntHolder's current balance is $$balance"
    }
}