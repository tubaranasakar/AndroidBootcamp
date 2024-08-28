package com.example.kotlindersleri.nesne_tabanli_programlama.composition

data class Filmler(var film_id: Int,
                   var film_adi : String,
                   var film_yil : Int,
                   var kategoriler : Kategoriler,
                   var yonetmenler: Yonetmenler) //kategoriler ve yonetmenler sayesinde composition yapmış olduk.yani veritabanındaki foreignkeyleri bu şekilde birleştirdik

{



}