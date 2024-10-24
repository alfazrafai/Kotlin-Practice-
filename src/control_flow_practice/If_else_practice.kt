package control_flow_practice

fun main() {

////  Write a Kotlin program to check if a given number is positive, negative, or zero.
//    println("Enter the Number")
//
//    val number: Int? = readlnOrNull()?.toIntOrNull()
//
//    if (number != null) {
//        if (number > 0) {
//            println("Number $number is Positive Number")
//        } else if (number < 0) {
//            println("Number $number is Negative")
//        } else {
//            println("Number $number is zero")
//        }
//    }


//   Write a Kotlin program to check if a given number is divisible by 7.
//    println("Enter the number")
//    val num: Int? = readlnOrNull()?.toIntOrNull()
//
//    if (num != null) {
//        if(num %7 == 0){
//            println("Number $num is divisible by 7")
//        } else {
//            println("Number is not divisible by 7")
//        }
//    }


//  Write a Kotlin program to check if a given character is a vowel or a consonant.

    println("Enter the character between a to z")
    val character: Char? = readlnOrNull()?.singleOrNull()

    if (character != null){
        if(character in "aeiou"){
            println("Character $character is vowel")
        } else {
            println("Character $character is constant")
        }
    }

}

