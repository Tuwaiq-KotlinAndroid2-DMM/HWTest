fun main(){
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