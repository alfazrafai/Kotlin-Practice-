package class_object

fun main(){

    val voter = Voter()
    voter.ageToVote = 12
    println(voter.ageToVote)
    println(voter.nameOfVoter)
}

class Voter() {
    var ageToVote: Int = 18

        get() = field
        set(value) {
            if (value < 18){
                println("Age to vote can not be less than 18")
            } else {
                field = value
            }
        }

    var nameOfVoter = "Mark"
        get(){
            return "$field is eligible for vote"
        }
}