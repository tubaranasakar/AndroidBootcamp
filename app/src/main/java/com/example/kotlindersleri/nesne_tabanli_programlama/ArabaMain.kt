package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    // Nesne oluşturma
    val bmw = Araba("Kırmızı",0,false)

    // Okuma
    bmw.bilgiAl()

    // Veri atama
    bmw.renk = "Mavi"
    bmw.hiz = 100
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.hizlan(70)
    bmw.bilgiAl()
    bmw.yavasla(20)
    bmw.bilgiAl()

    val mercedes = Araba("Beyaz", 250, true)
    mercedes.bilgiAl()
    mercedes.durdur()
    mercedes.bilgiAl()
    mercedes.hizlan(20)
    mercedes.bilgiAl()
}