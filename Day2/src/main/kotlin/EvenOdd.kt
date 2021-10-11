fun main(){

    println("Please enter a number")

    var num = Integer.valueOf(readLine()) // this step is to convert String to Int

    if (num % 2 ==0 ){

        println("Even number")
    }
    else{
        println("Odd number")
    }
}