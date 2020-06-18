package Package

fun main(){
    //If statement in Kotlin
    var num=5
    if (num>10){
        //true block
        println("Yes")
    }else{
        //False block
        println("No")
    }

    var n1=56
    var n2=78

    var max=if (n1>n2){
        n1
    }else{
        n2
    }
    //Other way of writing (Like ternary operation
    var max2=if (n1>n2) n1 else n2
    println("Max is $max")



    /** Switch statement in kotlin was removed and instead
        when statement is introduced
        It's just advance version of switch statement
    */

    var day=9

    var dayInWorld= when(day){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        in 8..100->"someDay"
        else->"Invalid number"
    }

    println("$dayInWorld")
}