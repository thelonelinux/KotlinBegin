package Package

fun main(){
    //Also called as type casting
    //Here not like in java that bigger value can itself convert
    //Here nothing like that
    //So no automatic type casting not supported

    //Here We use some kind of functions given to conversion
    /**
     * toByte()
     * toInt()
     * toLong()
     * toDouble()
     * toShort()
     */

    var v:Int=2323
    var l:Long=v.toLong()
    var d:Double=v.toDouble()
    println(l)
    println(d)
}