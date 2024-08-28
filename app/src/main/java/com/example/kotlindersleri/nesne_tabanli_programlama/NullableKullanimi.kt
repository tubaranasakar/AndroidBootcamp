package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    // Nullable - Null safety - Optional(swift)

    // Tanımlama -> str değeri aşağıda tanımlanırken null olabilir anlamına gelir
    var str : String? = null
    str = "Merhaba"

    // Yöntem 1
    println("Yöntem 1 : ${str?.trim()}") // -> str değeri boş ise hata vermez dolu ise değeri yazdırır


    // Yöntem 2
    //println("Yöntem 2 : ${str!!.trim()}")} // -> burası null olmayacak demek. null gelirse uygulama çöker

    // Yöntem 3
    if (str != null){
        println("Yöntem 3 : ${str.trim()} ")
    }else{
        println("Sonuç nulldur")
    }

    // Yöntem 4
    str?.let {
        println("Yöntem 4 : ${it.trim()} ")
    }
}