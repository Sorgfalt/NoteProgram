package com.company

import java.util.*


/*
var sum=0

fun calSum() {
    for (i in 1 .. 10)
    {
        sum += i
    }
}
class T1_User{
    val name="kkang"
    fun sayHello(){
        val date=exampleDate(){
            println("date :" + exampleDate)
            println("Hello :" + name)
        }
    }
}
fun main(args: Array<String>) {
    calSum()
    println(sum)
    T1_User().sayHello()
}
*/

fun sayhello(name : String = "kkang", no:Int){
    println("hello!" + name)
}
fun main(){
    //sayhello(10)
    sayhello("lee",20)
    sayhello(no=10)
}
