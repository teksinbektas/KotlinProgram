package com.example.kotlindersleri.odevler



fun main() {
    //Fahrenhiet Testi
    var a = 4;
    println("$a derecenin fahrenheiti: ${FahrenaytDonustur(a)}")

    //Cevre Sorusu Testi
    CevreHesapla(2,3)

    //Faktoriyel Sorusu Testi
    val s1 = 7
    println("${s1} sayisinin faktoriyeli: ${FaktoriyelHesapla(s1)}")

    //Harf Say
    val girilenKelime = "Ankara"
    val aHarfiSayisi = aHarfiniSay(girilenKelime)
    println("Kelime içinde $aHarfiSayisi adet 'a' harfi var.")

    //icAcilarToplamiHesapla
    val girilenKenarSayisi = 5
    val toplamIcAci = icAcilarToplamiHesapla(girilenKenarSayisi)
    println("Kenar sayısı $girilenKenarSayisi olan bir çokgenin iç açılar toplamı: $toplamIcAci derece.")

    //maaşgun
    val girilenGunSayisi = 25
    val toplamMaas = maasHesapla(girilenGunSayisi)
    println("$girilenGunSayisi gün çalışarak kazanılan maaş: $toplamMaas TL")

    //kotaHesapla
    val girilenKota = 60
    val toplamUcret = kotaUcretiHesapla(girilenKota)
    println("$girilenKota GB kullanım için toplam ücret: $toplamUcret TL")

}
//1
fun FahrenaytDonustur (derece : Int) : Double {
    return derece * 1.8 +32
}
//2
fun CevreHesapla ( kenar1: Int, kenar2: Int) {
    println("Cevre: ${2*(kenar1+kenar2)}")
}
//3
fun FaktoriyelHesapla (sayi: Int) : Int {
    if(sayi==1){
        return 1
    }
    return sayi * FaktoriyelHesapla(sayi-1)
}
//4
fun aHarfiniSay(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}
//5
fun icAcilarToplamiHesapla(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

//6
fun maasHesapla(gunSayisi: Int): Int {
    val calismaSaati = gunSayisi * 8
    val normalSaatUcreti = 10
    val mesaiSaatUcreti = 20
    val normalCalismaSaati = if (calismaSaati > 160) 160 else calismaSaati
    val mesaiSaati = if (calismaSaati > 160) calismaSaati - 160 else 0

    val maas = (normalCalismaSaati * normalSaatUcreti) + (mesaiSaati * mesaiSaatUcreti)
    return maas
}

//7
fun kotaUcretiHesapla(kullanilanKota: Int): Int {
    val sabitUcret = 100
    val kotaLimiti = 50
    val asimUcreti = 4

    return if (kullanilanKota <= kotaLimiti) {
        sabitUcret
    } else {
        val asimMiktari = kullanilanKota - kotaLimiti
        sabitUcret + (asimMiktari * asimUcreti)
    }
}