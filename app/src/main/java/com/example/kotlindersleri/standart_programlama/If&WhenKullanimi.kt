package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 23
    val isim = "Tuba"

    if (yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    if (isim == "Tuba"){
        println("Tebrikler")
    }else{
        println("Farklı bir isim giriniz")
    }

    val ka = "Maris"
    val sifre = 12345

    if (ka == "Maris" && sifre == 12345){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş yaptınız")
    }

    //When
    val gun = 3

    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")


    }






}