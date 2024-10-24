package abstraction

fun main(){
  val array = arrayOf(Addition(),Substraction(),Division())
    for(op in array){
        op.mathOp(10,8)
    }

    val add: MathOperations = Addition()
    add.mathOp(23,33)
}

abstract class MathOperations(){

    abstract fun mathOp(number1: Int, number2: Int)
}

class Addition : MathOperations(){
    override fun mathOp(number1: Int, number2: Int) {
        val addition = number1 + number2
        println(addition)
    }
}

class Substraction : MathOperations(){
    override fun mathOp(number1: Int, number2: Int) {
        val substraction = number1 - number2
        println(substraction)
    }
}

class Division : MathOperations(){
    override fun mathOp(number1: Int, number2: Int) {
        val division = number1/number2
        println(division)
    }

}