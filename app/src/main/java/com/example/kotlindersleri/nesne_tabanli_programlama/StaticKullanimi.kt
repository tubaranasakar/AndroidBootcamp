package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val a = ASinifi()
    //println(a.x)
    //a.metod()

    // Virtual Object - Sanal Nesne - İsimsiz nesne
    //println(ASinifi().x)
    //ASinifi().metod()

    // metod ve x değişkenini companion object içerisinde static olarak tanımladığımız için direkt erişim sağlayabildik
    println(ASinifi.x)
    ASinifi.metod()
}