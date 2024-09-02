package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //Veri ekleme
    meyveler.add("Elma") //0. indexten yerleştirmeye başlar
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Portakal"
    println(meyveler)

    //Insert
    meyveler.add(1,"Vişne")
    println(meyveler)

    //Okuma
    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş mu : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Kiraz")}")

    meyveler.reverse() // Sıralamayı tersine çevirir
    println(meyveler)

    meyveler.sort() // String bir liste olduğundan dolayı sıralamayı alfabetik yapar
    println(meyveler)

    for (meyve in meyveler){
        println("Sonuç : ${meyve}")
    }

    for ((indeks, meyve) in meyveler.withIndex()){
        println("$indeks. -> ${meyve}")
    }

    meyveler.removeAt(2) // 2. indeksi siler
    println(meyveler)

    meyveler.clear() // Komple içeriğini siler
    println(meyveler)
}