package com.example.kotlindersleri.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Ejder Meyvesi")
    meyveler.add("Avakado")
    meyveler.add("Mango")
    meyveler.add("Hindistan Cevizi")
    println(meyveler)

    meyveler.add("Tropikal Avakodo")
    println(meyveler)

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for(m in meyveler){
        println("Sonuç : ${m}")
    }

    for((i,m) in meyveler.withIndex()){
        println("$i. indeks-> ${m}")
    }

    meyveler.remove("Mango")
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}