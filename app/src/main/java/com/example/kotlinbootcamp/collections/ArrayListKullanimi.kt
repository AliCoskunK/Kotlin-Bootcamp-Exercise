package com.example.kotlinbootcamp.collections

fun main() {
    //TANIMLAMA
    val sayilar=ArrayList<Int>()
    val meyveler=ArrayList<String>()

    //VERİ EKLEME
    meyveler.add("Elma")//0.Değer
    meyveler.add("Muz")//1
    meyveler.add("Kiraz")//2
    println(meyveler)

    //GÜNCELLEME

    meyveler[1]="YENİ MUZ"//0
    println(meyveler)

    //İNSERT

    meyveler.add(index = 1, element ="Portakal" )
    println(meyveler)

    //OKUMA İŞLEMİ

    println(meyveler[3])
    println(meyveler.get(2))






    println("BOYUT:${meyveler.size}")
    println("Boyut:${meyveler.count()}")
    println("Boş kontrol:${meyveler.isEmpty()}")
    println("İçeriyor mu:${meyveler.contains("KİRAZX")}")

    meyveler.reverse()//tersleme
    println(meyveler)

    meyveler.sort() //sıralama
    println(meyveler)


    for (meyve in meyveler){
        println(meyve)
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("$indeks.-> $meyve")
    }

    //SİLME

    meyveler.removeAt(2) //ikinci indeksteki veriyi siler
    println(meyveler)


    meyveler.clear()//tum verileri siler
    println(meyveler)




















}