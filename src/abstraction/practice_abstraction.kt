package abstraction

fun main(){
  val dev = Developer("Alfaz",1)
    dev.employeeDetails()
    dev.dateOfBirth("21 November")
}


abstract class Employee(val name: String, val experience: Int){

    abstract var salary: Double

    abstract fun dateOfBirth(date: String)


    fun employeeDetails(){
        println("Name of employee is $name")
        println("Salary of employee is $salary")
        println("experience of employee is $experience")
    }
}

class Developer(name: String, experience: Int) : Employee(name, experience){
    override var salary = 30000.300
    override fun dateOfBirth(date: String) {
       println("Date of birth is $date")
    }


}

