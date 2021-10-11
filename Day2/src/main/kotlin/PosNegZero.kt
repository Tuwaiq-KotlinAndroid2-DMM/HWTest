fun main(){

    println("enter a number")

    var num = Integer.valueOf(readLine())

    if (num > 0) {
        println("you entered a positive number")
    }
    else if (num < 0){
        println("You entered a negative number")
    }
    else{
        println("you Entered a Zero")
    }

}