package Package

fun main(){
    //For loop in kotlin
    //Very different than other programming language


    //Sample for loop in kotlin
    for (i in 1..10){
        println("Value of i is $i")
    }
    //Opposite
    for(i in 10 downTo 1){
        println("Value of i is $i")
    }
    //Odd number
    for (i in 1..10 step 2){
        println("Value of i is $i")
    }

    var sum=0
    for (i in 1..10){
        sum=sum+i
    }
    println("Sum is $sum")




    //While Loop in Kotlin
    var i=1
    while (true){
        if (i==11) break
        println(i)
        i++
    }

    //count number of digits in a number
    var n=23234
    var c=0
    while (n>0){
        c++
        n=n/10
    }
    println(c)

}