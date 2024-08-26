package com.example.kotlindersleri.nesne_tabanli_programlama

class Araba(var renk : String, var hiz : Int, var calisiyorMu : Boolean) {

    init {
        println("****Constructor çalıştı****")
    }

    fun calistir(){ //Side effect: fonksiyon ile sınıfın özelliklerini değiştirebilme
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm : Int){
        hiz+= kacKm

    }

    fun yavasla(kacKm : Int){
        hiz-= kacKm

    }

    fun bilgiAl(){
        println("----------------------------")
        println("Renk         : ${renk}")
        println("Hız          : ${hiz}")
        println("Çalışıyor mu : ${calisiyorMu}")
    }

    // this veya self(swift) : bulunduğun sınıfı temsil eder
    //super : kalıtım varsa üst sınıfı temsil eder
}