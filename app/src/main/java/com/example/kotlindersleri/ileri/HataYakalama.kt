package com.example.kotlindersleri.ileri

fun main() {
    // 1 -> Compile Error
    val x = 10
    //x = 5

    // 2 -> Exception : Runtime Error
    val a = 10
    val b = 5

    try {
        println("Sonuç : ${a / b}")
        println("İşlem Tamam")
    }catch (e : Exception){
        println("İkinci sayı sıfır olamaz")
    }
}