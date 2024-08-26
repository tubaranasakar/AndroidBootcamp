package com.example.kotlindersleri.standart_programlama

fun main() {
    for(i in 1..3){
        println("Döngü 1 : $i")
    }

    for (a in 10..20 step 5){ // beşer beşer arttırma
        println("Döngü 2 : $a")
    }

    for (b in 20 downTo 10 step 5){ // beşer beşer azaltma
        println("Döngü 3 : $b")
    }

    var sayac = 1

    while (sayac<6){
        println("Döngü 4 : $sayac")
        sayac++
    }

    for(i in 1..5){
        if (i== 3){
            break
        }
        println("Döngü 5 : $i")
    }

    for(i in 1..5){
        if (i== 3){
           continue
        }
        println("Döngü 6 : $i")
    }

}