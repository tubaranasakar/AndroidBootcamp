package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    ucretHesapla(120,KonserveBoyutu.ORTA)
    ucretHesapla(120,KonserveBoyutu.BUYUK)


}
fun ucretHesapla(adet : Int,boyut : KonserveBoyutu){
    when(boyut){
        KonserveBoyutu.KUCUK -> println("Toplam Maliyet : ${adet * 30} ₺'dir ")
        KonserveBoyutu.ORTA -> println("Toplam Maliyet : ${adet * 40} ₺'dir ")
        KonserveBoyutu.BUYUK -> println("Toplam Maliyet : ${adet * 50} ₺'dir ")
    }

}