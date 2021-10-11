fun main(){
    println("Please enter a number: ")
    var num =Integer.valueOf(readLine())
    if (num > 0) {
        println("Positive")
    }
    else if (num < 0) {
        println("Negative")
    }
    else{
        println("You entered zero")
    }
}