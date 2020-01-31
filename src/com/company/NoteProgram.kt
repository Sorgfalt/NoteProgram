package com.company

import com.sun.javafx.tools.packager.CreateBSSParams
import java.util.*

enum class Note { CREATE, READ, UPDATE, DELETE }

fun main(args: Array<String>) {
    getNote(Note.CREATE)
    getNote(Note.READ)
    getNote(Note.UPDATE)
    getNote(Note.DELETE)
}

fun getNote(n: Note) {
    val scanner = Scanner(System.`in`)
    println("프로그램을 시작합니다")
    println("무엇을 입력하시겠습니까?" + "C. 생성 " + "R. 읽기 " + "U. 수정 " + "D. 삭제")
    println("입력값 : ")
    val sc = scanner.nextLine()
    when (n) {
        Note.CREATE -> print("값을 입력해주세요 ")
        Note.READ -> print("몇번을 출력하시겠습니까?")
        Note.UPDATE -> print("몇번을 수정하시겠습니까?")
        Note.DELETE -> print("몇번을 삭제하시겠습니까?")
        else -> print("값을 다시 입력해주세요!")
    }
}







