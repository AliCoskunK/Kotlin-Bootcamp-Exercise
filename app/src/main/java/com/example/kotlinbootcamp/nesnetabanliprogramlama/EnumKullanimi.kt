package com.example.kotlinbootcamp.nesnetabanliprogramlama

fun main() {
 ucretHesapla(124,KonserveBoyut.ORTA)
}
fun ucretHesapla(adet:Int,boyut:KonserveBoyut){
    when (boyut){
        KonserveBoyut.KUCUK -> println("Toplam maliyet:${adet*30} ")
        KonserveBoyut.ORTA -> println("Toplam maliyet:${adet*40} ")
        KonserveBoyut.BUYUK -> println("Toplam maliyet:${adet*50} ")
    }
}