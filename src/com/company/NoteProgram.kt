package com.company

import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.exitProcess

enum class Note { CREATE, READ, UPDATE, DELETE, FINISH, HELP }

val list: MutableList<String> = mutableListOf()

fun main(args: Array<String>) {
    println("프로그램을 시작합니다")
    while (true) {
        print("""
            
            무엇을 입력하시겠습니까? C, R, U, D, F, ?
            입력값 : 
        """.trimIndent())
        inputCheck(input())
    }
}

fun input(): String {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    return input
}

fun inputCheck(input: String) {
    val note = when (input) {
        "C" -> Note.CREATE
        "R" -> Note.READ
        "U" -> Note.UPDATE
        "D" -> Note.DELETE
        "F" -> Note.FINISH
        "?" -> Note.HELP
        else -> throw Exception("알수없는 값 입력으로 프로그램이 종료되었습니다")
    }
    when (note) {
        Note.CREATE -> {
            print("값을 입력해주세요 : ")
            val inputSave = input()
            list.add(inputSave)
        }
        Note.READ -> {
            println(list.toString())
        }
        Note.UPDATE -> {
            print(list.toString() + "값의 리스트가 있습니다 몇번을 수정 하겠습니까? ")
            val index = input().toInt() - 1
            print("수정: ")
            val replaceResult = input()
            list.set(index, replaceResult)
            println("수정된 값: $replaceResult")
        }
        Note.DELETE -> {
            println(list.toString() + "값의 리스트가 있습니다 몇번을 삭제 하겠습니까? :")
            val result = list.removeAt(input().toInt() - 1)
            println(result + "가 삭제 되었습니다.")
        }
        Note.FINISH -> {
            println("프로그램이 종료되었습니다")
            exitProcess(0)
        }
        Note.HELP -> {
            println("C = Create")
            println("R = Read")
            println("U = Update")
            println("D = Delete")
            println("F = Finish")
        }
    }
}
