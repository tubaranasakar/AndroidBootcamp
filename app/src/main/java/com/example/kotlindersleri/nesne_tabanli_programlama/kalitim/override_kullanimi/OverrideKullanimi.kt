package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() // Kalıtım yok. Kendi sınıfına erişti
    memeli.sesCikar() // Kalıtım var. Üst sınıfın metodunu kullandı
    kedi.sesCikar() // Kalıtım var. Kendi metodunu kullandı
    kopek.sesCikar() // Kalıtım var. Kendi metodunu kullandı
}