package com.example.kotlinbootcamp.ileri

fun main() {
    //HATA YAKALAMA YÖNTEMİ
    //1.Compile error:Geri dönüşü olan uygulamayı çökertmeyen hatalar.

    val x=10
    //val x=300





    //2.Exception:RUNTİME ERROR - ÇALIŞTIRMA SIRASINDA-UYGULAMAYI ÇÖKERTEBİLECEK HATA

    val a=10
    val b=2




    try {
        println("Sonuç : ${a/b}")
        println("İşlem tamam")


    }catch (e:Exception){
        println("İkinci sayı 0 olamaz")

    }





}