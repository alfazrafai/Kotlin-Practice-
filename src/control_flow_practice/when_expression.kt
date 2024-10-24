package control_flow_practice

fun main() {

    println("Enter the number between 1 to 7")
    var day = readLine()?.toIntOrNull()

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Number")
    }

    println("Enter your grade")
    var grade: Int? = readLine()?.toIntOrNull()

//    when (grade!!) {
//        in 90..100 -> println("A")
//        in 80..89 -> println("B")
//        in 70..79 -> println("C")
//        in 60..69 -> println("D")
//        in 60..1 -> println("F")
//    }


    if (grade != null) {
        when {
            grade >= 90 -> println("A")
            grade >= 80 -> println("B")
            grade >= 70 -> println("C")
            grade >= 60 -> println("D")
            else -> println("F")
        }
    }




    println("Enter the first number")
    var number1 = readLine()?.toIntOrNull()

    println("Entet the second number")
    var number2 = readLine()?.toIntOrNull()

    println("Enter the Opration ex: +,-,*,/")
    var opration = readLine()


    when(opration){
        "+" -> println("The sum of $number1 and $number2 is ${number1!! + number2!!}")
        "-" -> println("The sub of $number1 and $number2 is ${number1!! - number2!!}")
        "*" -> println("The Multi of $number1 NS $number2 is ${number1!! * number2!!}")
        "/" -> println("The Div of $number1 ans $number2 is ${number1!! / number2!!}")
        else -> println("Invalid Operator")
    }

}