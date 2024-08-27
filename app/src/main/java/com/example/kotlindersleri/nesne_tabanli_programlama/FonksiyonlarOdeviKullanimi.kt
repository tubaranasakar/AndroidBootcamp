package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    val kmDonustur = FonksiyonlarOdevi()
    val donusenKm = kmDonustur.kmMil(100.0)
    println("Dönüşen km : $donusenKm")

    //----------
    val diktortgenAlan = FonksiyonlarOdevi()
    diktortgenAlan.diktorgenAlani(4,5)

    //----------
    val faktoriyel = FonksiyonlarOdevi()
    val gelenToplam = faktoriyel.faktoriyel(5)
    println("Faktoriyel Sonucu : $gelenToplam")

    //----------
    val girilenKelime = FonksiyonlarOdevi()
    val eHarfi = girilenKelime.kacEVar("edirne")
    println("Girilen kelimede $eHarfi tane 'e' harfi vardır")

    //----------
    val aci = FonksiyonlarOdevi()
    val kenarSayisi = aci.icAci(5.0)
    println("Bir kenarın iç Açısı : $kenarSayisi")

    //----------
    val maasHesabi = FonksiyonlarOdevi()
    val calisilanGun = maasHesabi.maasHesabi(30)
    if (calisilanGun*8 <= 150){
        val toplam = calisilanGun*40
        println("$calisilanGun Gün için hesabınıza yatırılan tutar : $toplam₺'dir")
    }else{
        var fazlaMesai = calisilanGun*8 - 150
        val toplam = (fazlaMesai*80) + (150*40)
        println("$calisilanGun Gün için hesabınıza yatırılan tutar : $toplam₺'dir")
    }

    //----------

    val otoparkSuresi = FonksiyonlarOdevi()
    val sure = otoparkSuresi.otoparkUcreti(2)

    if (sure<=1){
        var ucret = 50
        println("1 saatlik otopark ücretiniz : $ucret₺'dir")
    }else{
        val toplam = (sure-1)*10 + 50
        println("$sure saatlik otopark ücretiniz : $toplam₺'dir")
    }
}