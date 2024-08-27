package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //Void -> geri dönüş değeri olmayan
    fun selamla1(){
        val sonuc = "Merhaba Maris"
        println(sonuc)
    }

    // return -> geri dönüş değeri olan
    fun selamla2() : String {
        val sonuc = "Merhaba Maris"
        return sonuc
    }

    //parametre
    fun selamla3(isim:String){
        val sonuc = "Merhaba ${isim}"
        println(sonuc)
    }

    fun toplam(sayi1:Int, sayi2:Int) : Int{
        val toplam = sayi1 + sayi2
        return toplam
    }

    //Overloading -> aynı isimli fonksiyon adı ile farklı parametre türü alırsak hata vermemesidir
    fun carp(sayi1: Int, sayi2: Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1: Double, sayi2: Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1: Int, sayi2: Double){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1: Double, sayi2: Double){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1: Int, sayi2: Int, isim : String){
        println("Çarpma : ${sayi1*sayi2} İşlemi yapan : $isim")
    }
}