package control_flow_practice

fun main(){

//    Print the first 10 natural numbers

    for(i in 1..10){
        println(i)
    }

// Fibonacci series
//    println("Enter the End Number for fibonacci series")
//    val numberToEnd: Int? = readlnOrNull()?.toIntOrNull()
//    var firstNumber = 0
//    var secondNumber = 1
//
//    for(i in 1..numberToEnd!!){
//        println(firstNumber)
//
//        val nextNumber = firstNumber + secondNumber
//        firstNumber = secondNumber
//        secondNumber = nextNumber
//    }

// Write a Kotlin program to calculate the sum of all numbers between two given numbers.

//    println("Enter the start number")
//    val startNumber: Int? = readlnOrNull()?.toIntOrNull()
//    println("Enter the end number")
//    val endNumber: Int? = readlnOrNull()?.toIntOrNull()
//
//    if (startNumber != null && endNumber != null){
//        if(endNumber >= startNumber){
//            var sum = 0
//            for (i in startNumber..endNumber){
//                sum += i
//            }
//            println("The sum of all numbers between $startNumber and $endNumber is $sum")
//
//        }
//    }


//    Write a program to print all even numbers between 1 and 20.


    var sNum = 1
    var eNum = 20

    for(i in sNum..eNum){
        if(i %2 == 0){
            println(i)
        }
    }


   for (i in 1..30){
       if(i %3 == 0){
           println(i)
       }
   }

//Print a Table of Squares 1 to 10
    for(i in 1..10){
        println("Square of $i is ${i * i} ")
    }


}

