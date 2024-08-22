package com.example.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Tuba"
    var ogrenciYas = 23
    var ogrenciBoy = 1.56
    var ogrenciBasharf = 't'
    var ogrenciDevamlilik = true

    println("Öğrencinin adı : $ogrenciAdi")
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamlilik)

    var a = 10
    var b = 20
    println("$a x $b = ${a*b}")

    //Sabitler - Constant
    // val - let(swift)
    var sayi = 10
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 40
    println(numara)
    //numara = 80

    // Tür dönüşümleri- Type Casting

    // Sayısaldan sayısala dönüşüm
    val i = 41
    val d = 12.34

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    //Sayısaldan metine dönüşüm
    val sonuc3 = i.toString() // arka planda buna dönüşür : "41"
    val sonuc4 = d.toString() //arka planda buna dönüşür : "12.34"

    println(sonuc3)
    println(sonuc4)

    //Metinden sayısala dönüüşüm
    val yazi = "56.78t"

    val sonuc5 = yazi.toDoubleOrNull() // double değilse nulldır demek için kullanılır

    if (sonuc5 != null ){
        println(sonuc5)
    } else{
        println("Hatalı değer dönüşümü yaptınız")
    }

    // yukarıdaki if ile aynı sorgu
    sonuc5?.let {
        println(it)
    }

}