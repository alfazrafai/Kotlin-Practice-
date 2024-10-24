package inheritance

open class Person(name: String, age: Int){
    init {
        println("My name is $name")
        println("My age is $age")
    }

}

class MathTeacher(name: String,age: Int) : Person(name, age){

    fun teach(){
        println("I am teaching maths in primary school")
    }
}

class FootBaller(name: String,age: Int) : Person(name, age){

    fun playFootBall(){
        println("I am playing football for state")
    }
}

fun main(){

    val teacher = MathTeacher("Rakesh",30)
    teacher.teach()

    val player = FootBaller("Mark",28)
    player.playFootBall()
}

