package com.example.kotlinbootcamp.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasharf = 'A'
    var ogrenciDevamEdiyormu = true



    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyormu)



    var urun_id : Int = 3416
    var urunadi :String = "Macbook Pro"
    var urunadet : Int = 100
    var urunfiyat : Double = 42999.99
    var uruntedarikci : String = "Apple"


    println("Ürün id : $urun_id")
    println("Ürün adı: $urunadi")
    println("Ürün adet : $urunadet")
    println("Ürün fiyat : $urunfiyat")
    println("Ürün tedarikcisi : $uruntedarikci")

    var a = 10
    var b=20

    println("$a x $b: $ {a * b }")

    //Süslü parantez içinde birden fazla işlem yaptırabiliyoruz $ simgesi ile

    //Sabitler Constant
    //val(Kotlin) - Let (Swift) final (Java)
    var sayi = 30
    println(sayi)

    sayi = 100
    println(sayi)

    val numara = 40

    println(numara)

     //numara = 80

    //Tür Dönüşümü Type Casting
    val i = 42
    val d = 78.95

    //Sayısaldan sayısala dönüşüm
    val sonuc1 =i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    //Sayısaldon metine dönüşüm
    val sonuc3 =i.toString()//"42"
    val sonuc4 = d.toString()//"78.95"
    println(sonuc3)
    println(sonuc4)

    //Metinden sayısala dönüşüm
    val yazi= "67.54"

    val sonuc5 = yazi.toDoubleOrNull()

    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşüm hatası oluştu ve sayınızı kontrol ediniz.")
    }
    sonuc5?.let { it:Double ->

        println(it)
    }



















































}