package inheritance

fun main(){
  val derived = DerivedClass()
    println(derived.name)
    derived.methodDerivedClass()
    derived.methodBaseClass()
}

open class BaseClass(){
    var name = "Base Class"
    fun methodBaseClass(){
        println("I am Base Class")
    }
}

class DerivedClass : BaseClass(){
    var name1 = "DerivedClass"
    fun methodDerivedClass(){
        println("I am Derived Class")
    }
}


