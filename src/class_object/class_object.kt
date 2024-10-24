package class_object

fun main() {

    val person1 = Person("Mark",19,"male","Software Developer")
    println("Name of Person is ${person1.name}")
    person1.work()

    val student1 = Student("Ahemad", 2, 23)
    student1.detailsOfStudent()

    val additionOfTwoNumbers = AddNumbers()
    val result = additionOfTwoNumbers.addition(23,33)
    println(result)

    val innova = Car("Toyota","2.4 GX 8Str",2022,"white")
    val car = innova.startEngin()
    println(car)

    val book = Book("Kotlin","john Horton",2000.2)
    book.detailOfBook()
    book.discountPrice(10.0)
}

class Person(var name: String,var age: Int, var gender: String, var occupation: String) {

    fun work() {
        println("$name is a $occupation")
    }

    fun getGender() {
        println("Gender of $name is $gender")
    }

    fun getAge() {
        println("Age of $name is $age")
    }
}


class Student(var name: String, var id: Int, var roll_number: Int) {

    fun detailsOfStudent() {
        println("Name of student is $name and Roll Number is $roll_number\nid is $id")

    }
}

class AddNumbers {
    fun addition(num1: Int, num2: Int): Int {
        val total = num1 + num2
        return total
    }
}


class Car(var brand: String, var model: String, var year: Int, var color: String){

    fun startEngin(){
        println("The Engine of $brand $model has started")
    }

}



class Book(var title: String, var author: String, var price: Double){

    fun detailOfBook(){
        println("This is book of $title and author of book is $author price of book is $price")
    }

   fun discountPrice(discount: Double){
        val discountAmount = price * (discount/100)
       price -= discountAmount
       println("The new price of Book with discount is $price")
    }

}

