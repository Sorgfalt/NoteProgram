package com.company

import java.util.*
import kotlin.collections.ArrayList

enum class Note { CREATE, READ, UPDATE, DELETE }

val list : ArrayList<String> = arrayListOf()

fun main(args: Array<String>) {
    while (true) {
        println("프로그램을 시작합니다")
        println("무엇을 입력하시겠습니까?" + "C. 생성 " + "R. 읽기 " + "U. 수정 " + "D. 삭제")
        println("입력값 : ")
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

        }
        Note.DELETE -> {
            println(list.toString() + "값의 리스트가 있습니다 몇번을 삭제 하겠습니까? :")
            val result = list.removeAt(input().toInt())
            println(result + "가 삭제 되었습니다.")
        }
        else -> print("값을 다시 입력해주세요!")
    }
}
