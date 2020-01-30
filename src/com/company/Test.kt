package com.company

fun main() {
    var data = "hello world"

    println(data)

    data += "hi"

    println(data)

    data = ""
    println(data)

    val name = "john Doe"
    println(name)

    val foo: String? = null
    println(foo)

    val bar: String = "bar"
    println(bar)

    val foo1: String = "Foo1"
    println(foo1)

    //foo1 = "foo1"

    var bar1: String = "Bar"
    println(bar1)

    bar1 = "bar2"
    println(bar1)

    val immutable: List<String> = listOf("foo", "bar", "baz")
    println(immutable)

    //immutable.add("Foo")

    val mutable: MutableList<String> = mutableListOf("foo", "bar", "baz")
    mutable.add("Foo")

    println(mutable)

    val items = listOf(10, 2, 3, 5, 6)
    val sumOfEvens = items.filter { it % 2 == 0 }.sum()
    println(sumOfEvens)

    val decValue: Int = 100
    println(decValue)

    val hexValue: Int = 0x100
    println(hexValue)

    val binaryValue: Int = 0b100
    println(binaryValue)

    val longValue: Long = 100L
    println(longValue)

    val doubleValue: Double = 100.1
    println(doubleValue)

    val floatValue = 10.0f
    println(floatValue)

    val foo2: Int = (2 or 4) shl 2
    println(foo2)

    val c: Char = 'A'
    println(c)

    val code: Int = 65
    val ch: Char = code.toChar()
    println(ch)

    val foo3: Boolean = true
    val bar2: Boolean = false

    val foo4: String = "Lorem ipsum"

    val foo5: String = "Lorem ipsum"
    val ch1: Char = foo5.get(4)
    val ch2: Char = foo5[6]

    println(foo5)
    println(ch1)
    println(ch2)

    val length: Int = 3000
    val lengthText: String = String.format("length: %d meters", length)
    println(lengthText)

    val lengText1: String = "Length: $length meters"
    println(lengText1)

    val text: String = "Lorem  ipsum"
    val lengthText2: String = "TextLength: ${text.length}"
    println(lengthText2)

    val price: Int = 1000
    val priceText: String = "price : ${'$'}$price"
    println(priceText)

    val words: Array<String> = arrayOf("Lorem", "ipsum", "dolor", "sit")
    println(words[0])

    val intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(intArr[2])

    val intArr2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(intArr2[4])

    fun printNumbers(vararg intArr3: Int) {
        for (number in intArr3) {
            println(number)
        }
    }
    val intArr3: IntArray = intArrayOf(1, 2, 3, 4, 5)
    printNumbers(*intArr3)

    fun printWords(vararg stringArr:String) {
        for (words in stringArr) {
            println(words)
        }
    }
    val stringArr : Array<String> = arrayOf("Lorem","ipsum","dolor","sit")
    printWords(*stringArr)

    fun foo6 (arr:Array<Int>) {
        for (n in arr){
            println(n)
        }
    }
    val intArr4 : Array<Int> = arrayOf(6,7,8,9)
    foo6(intArr4)

    fun bar3 (vararg stringArr2 : String) {
        for (b in stringArr2){
            println(b)
        }
    }
    val stringArr2 : Array<String> = arrayOf("hi1","hi2","hi3","hi4")
    bar3(*stringArr2)

    val immutableList1 : List<String> = listOf("won","euro","dolor","pound")
    //mutableList1.add("amet")

    println(immutableList1)

    val mutableList1 : MutableList<String> = arrayListOf("dolor","pound","euro","won")
    mutableList1.add("amet")
    println(mutableList1)

    val immutableList2 : List<String> = mutableList1
    mutableList1.add("amet")
    println(immutableList2)

    val immutableList3 : List<String> = listOf("Lorem","ipsum","dolor","sit")
    val firstItem: String = immutableList3[0]
    //immutableList3[0] = "Lollypop"
    println(immutableList3)

    val mutableList2 : MutableList<String> = arrayListOf("dolor","euro","pound","won")
    mutableList2[0] = "Lollypop"
    println(mutableList2)

    val immutableMap : Map<String, Int> = mapOf(Pair("A", 65), Pair("B",66))
    val code1 : Int? = immutableMap["A"]
    //immutableMap["C"] = 67
    println(code1)

    val mutableMap : HashMap<String, Int> = hashMapOf(Pair("A", 65), Pair("B", 66))
    mutableMap["C"] = 67
    println(mutableMap)

    val map : Map<String, Int> = mapOf("A" to 65, "B" to 66)
    println(map)

    println("hi")

    abstract class Foo7{
        abstract fun bar()
    }
    val foo7 = object: Foo7(){
        override  fun bar(){
            fun y(vararg barInt : Int){
                for(i in barInt){
                    println(i)
                }
            }
        }
    }
    println(foo7)
}





