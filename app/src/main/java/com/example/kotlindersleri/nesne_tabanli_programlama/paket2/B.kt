package com.example.kotlindersleri.nesne_tabanli_programlama.paket2

import com.example.kotlindersleri.nesne_tabanli_programlama.paket1.A

class B : A(){
    // A sınıfından kalıtım olduğundan dolayı oradaki değişkenlere erişim sağlayabildik
    fun fonksiyon2(){
        println(degisken)
        println(publicDegisken)
        println(internalDegisken)
        println(protectedDegisken)
    }

}