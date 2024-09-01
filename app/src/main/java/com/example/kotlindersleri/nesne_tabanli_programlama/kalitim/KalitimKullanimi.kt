package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val topkapiSayari = Saray(10,100)
    val bogazVilla = Villa(true,5)

    println(topkapiSayari.kuleSayisi)
    println(topkapiSayari.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)

    if (topkapiSayari is Saray){ // topkapıSarayi saraydan mı türedi sorgusu yapmış oluyoruz
        println("Saraydır")
    }else{
        println("Saray değildir")
    }

    /*
    // Upcasting
    val ev:Ev = bogazVilla

    //Downcasting
    val ev1 = Ev(7)
    val saray = ev1 as Saray

     */
}