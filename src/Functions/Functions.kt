package Functions

fun main() {
    println(sum(19, 20))

    val name = "Afzal"
    val grad = "A"
    val rolNumber = 34
    val id = 10

    studentDetail(name, rolNumber, id, grad)
    studentDetail("Samir", 24, 1, "B")

    // standard library function

    val addition = arrayOf(1, 4, 5, 3, 5, 5, 3, 4, 7, 6).max()
    println(addition)


    defaultArgumentFunc()
    defaultArgumentFunc("Mark")

    info(lastName = "Rafai", firstName = "Alfaz")


    employee()


}

fun sum(a: Int, b: Int): Int {
    val c: Int = a + b
    return c
}


fun studentDetail(name: String, roll_number: Int, id: Int, grad: String) {
    println("Name of the Student is the $name")
    println("Roll Number Of Student is $roll_number")
    println("Id of the Student id  $id")
    println("Grade og Student id  $grad")
}


// Default argument function

fun defaultArgumentFunc(name: String = "Samir") {
    println("Hello $name")
}


// Named Parameter Func

fun info(firstName: String, lastName: String){
    println("Firstname is $firstName and Lastname is $lastName")
}


//No arguments are passed while calling a function

fun employee(name: String = "Mark", id: Int = 1, salary: Double = 30000.30){
    println("Name of Employee is $name")
    println("Id of Employee is $id")
    println("Salary of Employee is $salary")
}

