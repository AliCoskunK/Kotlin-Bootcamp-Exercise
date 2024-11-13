package com.example.kotlinbootcamp.nesnetabanliprogramlama

class Fonksiyonlar {
     //void-geri dönüş değeri olmayan
    fun selamla1(){
        val sonuc="Merhaba Ahmet"
         println(sonuc)
    }
    //return-geri dönüş değeri olan

    fun selamla2():String{
        val sonuc="Merhaba Ahmet"
        return sonuc
    }

    //parametre
    fun selamla3(isim:String){
        val sonuc="Merhaba $isim"
        println(sonuc)
    }

    fun toplam(sayi1:Int,sayi2:Int):Int{
        val sonuc=sayi1+sayi2
        return sonuc

    }

    //overloading
    fun carp(sayi1: Double,sayi2:Int){ //aynı isme sahip değişkenler ama kullanabilmek için türlerini değiştiriyoruz
        println("Çarpma: ${sayi1*sayi2}")
    }

    fun carp(sayi1: Int,sayi2:Double){
        println("Çarpma: ${sayi1*sayi2}")
    }


    fun carp(sayi1: Int,sayi2:Int){
        println("Çarpma: ${sayi1*sayi2}")

    }











}