package com.example.kotlinbootcamp.nesnetabanliprogramlama

class Araba(var renk:String,var hız:Int,var calisiyormu:Boolean) {

    init {
        println("*********Constructor çalıstı*********")
    }


    fun bilgial(){ //Tek tek yazmak yerine bilgial fonksiyonu ile hepsinin yazdırabiliriz.
        println("------------------------------------")
        println("Renk:             ${renk}")
        println("Hız:              ${hız}")
        println("Çalışıyor mu:     ${calisiyormu}")
    }






    fun calistir(){ //side effect:Fonksiyon ile sınıfın özelliklerini değiştirme

        calisiyormu=true
        hız=200

    }

    fun durdur(){

        calisiyormu=false
        hız=0

    }

    fun hizlan(Kackm:Int){

        hız=hız+Kackm

    }

    fun yavasla(Kackm:Int){

        hız=hız-Kackm

    }











    //this veya self(swift) : Bulunduğunuz sınıfı
    //super:Kalıtım varsa üst sınıfı temsil eder.







}