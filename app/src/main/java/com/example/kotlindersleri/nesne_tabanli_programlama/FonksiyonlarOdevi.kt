package com.example.kotlindersleri.nesne_tabanli_programlama

class FonksiyonlarOdevi {
    // Parametre olarak girilen km'yi mile dönüştürdükten sonra geri döndüren metod örneği
    fun kmMil(km : Double) : Double {
        return km * 0.621
    }

    // Kenarları parametre olarak girilen ve dikdörtgenin alanını hesaplayan metod örneği
    fun diktorgenAlani(kenar1 : Int, kenar2 : Int){
        val alan = kenar1 * kenar2
        println("Dikdörtgen Alanı : $alan")
    }

    // Parametre olarak girilen sayının faktöriyel değerini hesaplayıp geri döndüren metod örneği
    fun faktoriyel(sayi : Int) : Int {
        val toplam = sayi * (sayi-1) * (sayi-2) * (sayi-3)* (sayi-4)
        return toplam
    }

    // Parametre olarak girilen kelime içerisinde kaç adet e harfi olduğunu gösteren metod örneği
    fun kacEVar(kelime : String) : Int {
        return kelime.count{it == 'e'}
    }

    //Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu
    //geri gönderen metod örneği
    fun icAci(kenarSayisi : Double ) : Double{
        val birKenarinAcisi = (kenarSayisi - 2)*180 / kenarSayisi
        return birKenarinAcisi
    }

    /* Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri
    döndüren metod örneği
    1 günde 8 saat çalışılabilir,
    çalışma saat ücreti = 40₺
    mesai saat ücreti = 80₺
    150 saat üzeri mesai sayılır */
    fun maasHesabi(calisilanGunSayisi : Int ) : Int{
        return calisilanGunSayisi
    }

    /* Parametre olarak girilen otopark süresine göre ücreti hesaplayarak geri döndüren
    metod örneği
    1 saat ücreti = 50₺
    1 saat aşımdan sonra her 1 saat 10₺ dir */

    fun otoparkUcreti(girilenSaat : Int) :Int{
        return girilenSaat
    }




}