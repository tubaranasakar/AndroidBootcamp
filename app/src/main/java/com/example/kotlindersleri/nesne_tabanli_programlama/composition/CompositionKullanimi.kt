package com.example.kotlindersleri.nesne_tabanli_programlama.composition

fun main() {
    val k1 = Kategoriler(1,"Komedi")
    val k2 = Kategoriler(2,"Romantik Komedi")

    val y1 = Yonetmenler(1,"Martin Scorsese")
    val y2 = Yonetmenler(2,"Stanley Kubrick")

    val f1 = Filmler(1,"Pijamalı Çocuk",2024,k1,y2)
    println("Film id : ${f1.film_id}")
    println("Film adı : ${f1.film_adi}")
    println("Film yılı : ${f1.film_yil}")
    println("Film kategorisi : ${f1.kategoriler.kategori_ad}")
    println("Film yönetmeni : ${f1.yonetmenler.yonetmen_ad}")




}