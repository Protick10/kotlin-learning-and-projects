package pro.inc.inheritence

fun main(){

//    val obj1 = BaseClass()
//    obj1.coreValues()
//
//    val obj2 = Secondary()
//    obj2.coreValues()
//    obj2.role()
//
//    val obj3 = Tertiary()
//    obj3.role()

    var frank = Offspring()
    frank.archary() //inherited from Archary
    frank.sing() // inherited from Singer
    frank.role() // inherited from BaseClass
    frank.coreValues() // inherited from BaseClass

}