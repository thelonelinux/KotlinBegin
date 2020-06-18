package Package

fun main(){
    var n1:Int=34
    var n2:Int=45
    var c:Int=n1+n2
    println("Sum of $n1 and $n2 is $c")    //In latest version of kotlin no need of braces after $
    println("Sum of ${n1} and ${n2} is ${c}")   //previous version requires braces

    val name:String="Hello"
    println("My Name is $name")
    println("My Name is ${name}")
}