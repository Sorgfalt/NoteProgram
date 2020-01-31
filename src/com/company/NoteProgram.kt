package com.company

import com.sun.javafx.tools.packager.CreateBSSParams
import java.util.*

fun main() {
    val Create : String = "Create"
    val Read : String = "Read"
    val Update : String = "Update"
    val Delete : String = "Delete"
    val scanner = Scanner(System.`in`)
    println("프로그램을 시작합니다")
        println("무엇을 입력하시겠습니까?" + "C. 생성" + "R. 읽기" + "U. 수정" + "D. 삭제")
        println("입력값 : ")
        val crud = scanner.nextLine()
    when (crud) {
            "C" -> print("값을 입력해주세요")
            "R" -> print("몇번을 출력하시겠습니까?")
            "U" -> print("몇번을 수정하시겠습니까?")
            "D" -> print("몇번을 삭제하시겠습니까?")
            else -> print("값을 다시 입력해주세요")

    }
    var userName : String = scanner.nextLine()
    println(userName = User(userName))
    println(userName.hashCode())
    println(userName)
}
data class User(var name : String){

}







