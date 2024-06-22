package pro.inc.inheritence

class Offspring: Secondary(), Archary, Singer{

    override fun archary() {
        super.archary()
        println("Archary skills enhanced by Offspring")
    }


    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }
}