package com.company

import java.util.*
import kotlin.coroutines.suspendCoroutine

fun main(args:Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val input = sc.nextLine()
    val person = Person()
    person.name = input

}
class Person{
    var name : String = ""
}

