package com.example.kotlindersleri.collections

fun main() {
    val o1 = Ogrenciler(69,"Tuba","1-B")
    val o2 = Ogrenciler(100,"Samet","2-A")
    val o3 = Ogrenciler(150,"Maris","3-C")

    val ogrencilerListesi = ArrayList<Ogrenciler>()

    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif} ")
    }

    //Sort - Sıralama
    println("Sıralama - > Küçükten büyüğe")
    val sirala1 =ogrencilerListesi.sortedWith(compareBy{it.no}) // ASC: ascend -> veritabanı
    for (o in sirala1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif} ")
    }

    println("Sıralama - > Büyükten küçüğe")
    val sirala2 =ogrencilerListesi.sortedWith(compareByDescending{it.no}) //DESC -> descend
    for (o in sirala2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif} ")
    }

    println("Metinler - > Küçükten büyüğe")
    val sirala3 =ogrencilerListesi.sortedWith(compareBy{it.ad}) // ASC: ascend -> veritabanı
    for (o in sirala3){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif} ")
    }

    println("Metinler - >  Büyükten küçüğe")
    val sirala4 =ogrencilerListesi.sortedWith(compareByDescending{it.ad}) // //DESC -> descend
    for (o in sirala4){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif} ")
    }

    // Filtreleme
    println("Filtreleme 1")
    val filtre1 = ogrencilerListesi.filter { it.no > 100 }
    for (o in filtre1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif} ")
    }

    println("Filtreleme 2")
    val filtre2 = ogrencilerListesi.filter { it.ad.contains("m") }
    for (o in filtre2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif} ")
    }
}