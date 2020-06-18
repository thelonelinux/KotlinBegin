package Package

fun main(){
    /**
     * Operators are special symbols to perform operations
     * (1) Arithmetic operations
     * (+,-,/,*,%)
     *
     *(2) Relational Operators  - comapre two values
     * (==,>=,<=,!=,>,<)
     *
     * (3)Logical Operators
     * (&&, ||, !) ALL the true ,and ANY then true ,and not to oppose
     *
     * (4)Assignment Operators
     * (=,+=,-=,*=,) Just assigning values to the variable
     */

    val a=10;
    val b=2;
    println(a+b)
    println("Addition operator= ${a+b}") //In similar way do rest
    println("Addition ${a.plus(b)}")

    println(a==b)
    println("Relational Operator ${a>b}")
}