package com.example.kotlindersleri.nesne_tabanli_programlama.paket1

open class A { //open kullanım sebebi kalıtım olacağıdır
    var degisken = 1
    public var publicDegisken = 2
    private var privateDegisken = 3
    internal var internalDegisken = 4
    protected var protectedDegisken = 5

    fun fonksiyon(){
        println(privateDegisken) // sadece bu sınıftan erişilebilir
    }

}
