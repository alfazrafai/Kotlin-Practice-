package polymorphism

fun main(){

    val employees: List<Employee> = listOf(
        FullTImeEmployee("Mark",20000.5,2000.5),
        PartTimeEmployee("Rock",10000.5,20),
        Intern("Roman",6000.5)
    )

    for (employee in employees){
        println("${employee.name}'s Bonus is ${employee.calculateBonus()}")
    }
}

open class Employee(val name: String, val salary: Double){

   open fun calculateBonus(): Double{
        return salary * 0.05
    }

}

class FullTImeEmployee(name: String, salary: Double, val benefits: Double ) : Employee(name,salary){
    override fun calculateBonus(): Double {
        return salary * 0.05 + benefits
    }

}

class PartTimeEmployee(name: String, salary: Double, val workingHours: Int) : Employee(name,salary){
    override fun calculateBonus(): Double {
        return salary * 0.05 + workingHours * 20
    }
}

class Intern(name: String,salary: Double) : Employee(name,salary){
    override fun calculateBonus(): Double {
        return 1000.5
    }
}