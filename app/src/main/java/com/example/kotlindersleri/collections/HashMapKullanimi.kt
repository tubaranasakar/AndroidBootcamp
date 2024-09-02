package com.example.kotlindersleri.collections

fun main() {
    //Dictinoary
    val iller = HashMap<Int, String>()
    iller.put(48,"Eski Muğla")
    iller.put(41,"Kocaeli")
    iller[6] = "Ankara"

    println(iller)
    println(iller.get(6))

    iller.put(48,"Yeni Muğla")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for((anahtar,değer) in iller){
        println("$anahtar -> $değer")
    }

    iller.remove(41)
    println(iller)

    iller.clear()
    println(iller)
}