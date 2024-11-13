package com.example.kotlinbootcamp.collections

fun main() {

    val o1=Ogrenciler(200,"Zeynep","9C")
    val o2=Ogrenciler(300 ,"Ahmet","11Z")
    val o3=Ogrenciler(100,"Beyza","12A")

    val ogrencilerListesi=ArrayList<Ogrenciler>()

    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for (o in ogrencilerListesi){
        println("No:${o.no} - Adı:${o.ad} - Sınıfı:${o.sinif}")

    }

    //SORT-SIRALAMA

    println("Sayısal:Küçükten > Büyüğe")
    val siralama1=ogrencilerListesi.sortedWith(compareBy { it.no }) //ASC:ascending=KÜÇÜKTEN BÜYÜGE
    for (o in siralama1) {
        println("No:${o.no} - Adı:${o.ad} - Sınıfı:${o.sinif}")
    }


    println("Sayısal:BÜYÜKTEN > KüÇÜĞE")
    val siralama2=ogrencilerListesi.sortedWith(compareByDescending { it.no }) //DESC:descending=BÜYÜKTEN KÜÇÜGE
    for (o in siralama2) {
        println("No:${o.no} - Adı:${o.ad} - Sınıfı:${o.sinif}")
    }


    println("METİNSEL:Küçükten > Büyüğe")
    val siralama3=ogrencilerListesi.sortedWith(compareBy { it.ad })
    for (o in siralama3) {
        println("No:${o.no} - Adı:${o.ad} - Sınıfı:${o.sinif}")
    }


    println("Sayısal:Küçükten > Büyüğe")
    val siralama4=ogrencilerListesi.sortedWith(compareByDescending { it.ad })
    for (o in siralama4) {
        println("No:${o.no} - Adı:${o.ad} - Sınıfı:${o.sinif}")
    }

    //FİLTRELEME

    println("FİLTRELEME 1")

    val filtreleme1=ogrencilerListesi.filter { it.no>200 } //NO 200'DEN BUYUK OLANLARI BUL
    for (o in filtreleme1) {
        println("No:${o.no} - Adı:${o.ad} - Sınıfı:${o.sinif}")
    }

    println("FİLTRELEME 2")

    val filtreleme2=ogrencilerListesi.filter { it.ad.contains("yz") } //kelimeleri icinde yz gecenleri bul
    for (o in filtreleme2) {
        println("No:${o.no} - Adı:${o.ad} - Sınıfı:${o.sinif}")
    }




















}