package com.company

fun main2() {
    fun foo(vararg intArr: Int) {
        for (number in intArr) {
            println("number")
        }
    }

    val intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    foo(*intArr)

    fun bar(vararg stringArr: String) {
        for (words in stringArr) {
            println("words")
        }
    }
    val stringArr : Array
    <String> = arrayOf("Lorem","ipsum")
    bar(*stringArr)
}

