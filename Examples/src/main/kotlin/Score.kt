import com.sun.jdi.IntegerValue

fun main(){

    println("Enter your score: ")
    var score= Integer.valueOf(readLine())


    if (score<60)
        println("Failed")
    else
        println("Passed")

    // Positive and negative

    println("Enter a number: ")
    var x= Integer.valueOf(readLine())
    if (x>0) {
        println("Positive")
    }
    else if (x<0){
        println("Negative")
    }
    else{
        println("It is 0")
    }
}