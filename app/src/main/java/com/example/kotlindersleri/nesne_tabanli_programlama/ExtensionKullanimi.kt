package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val carpimSonuc = 5.carpi(2)
    println("Gelen Sonuç : $carpimSonuc")

    val bolSonuc = 10.0 bol 5
    println("Gele Sonuc : $bolSonuc")

}

fun Int.carpi(sayi:Int) : Int {
    return this * sayi // this = Int
}
infix fun Double.bol(sayi: Int) : Double { // 10.0 bol 5 bu yazım şeklini sağlar
    return this / sayi
}
