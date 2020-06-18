package Package
import java.util.Scanner
import java.util.*

fun main(){

    //To learn string
    //Use readLine

    println("Enter your name")
    var name=readLine()
    println("Hello , $name")

    //but to read integer we have to do similar as scanner in java
    //Although we only need to import the scanner
    //Also to create scanner object we don't need a new operator

    val sc=Scanner(System.`in`)
    println("Enter n1 : ")
    var n1=sc.nextInt()
    println("Enter n2; ")
    var n2=sc.nextInt()
    println("Sum is ${n1+n2}")

    //to convert our input into integer from string we can do as
    var name2= readLine()?.toInt()   //? mark used to handle null pointer
}