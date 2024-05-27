package pro.inc.bankaccountprogram

fun main(){
    var jhonsAccount = BankAccount("John", 100.0)


//    println(jhonsAccount.accuntHolder)

    jhonsAccount.deposit(50.0)
    jhonsAccount.deposit(100.0)
    jhonsAccount.withdraw(10.0)
    jhonsAccount.deposit(200.0)
    jhonsAccount.withdraw(20.0)
    jhonsAccount.withdraw(200.0)
    jhonsAccount.displayTransactionHistory()
    println("Current balance: ${jhonsAccount.acctBalance()}")

    var sarasAccoount = BankAccount("Sara", 0.0)

    sarasAccoount.deposit(100.0)
    sarasAccoount.withdraw(10.0)
    sarasAccoount.deposit(300.0)

    sarasAccoount.displayTransactionHistory()
    println(sarasAccoount.acctBalance())
}