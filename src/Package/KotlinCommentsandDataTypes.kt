package Package

fun main(){
    //This is comment single line

    /**
    this is also comment multiLine comment with color same like in java
     */

    /*
    this is also comment multiLine comment
     */

    //Data type in Kotlin

    //Integer-Byte(1Bytes),Short(2Bytes),Int(4Bytes),Long(8Bytes)
    //Decimal=Floating Point Number-Float, Double

    var l:Long=4144542525
    println(l)

    var salary: Double=25424.546
    println("Your salary is $salary")


   //Character
    //Char- Single Character
    var ch:Char='A'
    println("My single character is $ch")

    //Boolean - true, false
    var flag:Boolean=true
    println("My boolean value is $flag")

    //Arrays-Multiple values
    //put same type in given list don't put different data types in same type

    var names= arrayOf("Sachin","Rahul","Arjunt")
    println(names[0])
    println(names[1])
    println(names.size)


    //String - Any value placed in double qoutes
    var name2="Hello world"
    println(name2)

    var name3="1230"
    println(name3)

    println(name2.length)
    println(name2.toUpperCase())

    //Further string functions you can learn in online for more 



}