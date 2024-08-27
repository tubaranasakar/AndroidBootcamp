package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f  = Fonksiyonlar() // f Fonksiyonlar classından bir nesne
    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : ${gelenSonuc}")

    f.selamla3("Tuba")

    val gelenToplam = f.toplam(10,20)
    println("Gelen Toplam : ${gelenToplam}")

    f.carp(2,10,"Tuğçe")
}