package Package

//Function-block of code
//Set of instruction to full fill a job
//print() and println() are predefined function
//Now we look for user defined function


//Here below return type is int.
//In case you pass no return type then it will take as void

fun doSum(n1:Int,n2:Int):Int{
    var s=n1+n2
    return s
}

//Default argument in case you provide no argument
//while calling the function
fun doSum2(n1:Int=1,n2:Int=1):Int{
    var s=n1+n2
    return s
}

fun main(){

    var sum= doSum(1,2)
    println("Sum is $sum")

    //You can also change order using named arguments
    var sum12= doSum(n2=1,n1=2)
    println("Sum is $sum12")

    //No argument passed so default argument will be assigned
    var sum2= doSum2()
    println("Sum is $sum2")

}