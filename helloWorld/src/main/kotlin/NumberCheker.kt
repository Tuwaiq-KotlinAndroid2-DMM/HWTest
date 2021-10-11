fun main() {
    println("please enter a number")
    var num=Integer.valueOf(readLine())
    if (num>0){
        print("the number you entered is positive")
    }else if (num<0){
        print("the number you entered is negative")
    }else{
        println("the number you entered = 0 ")
    }

}