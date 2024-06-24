package com.example.kotlinbootcamp.nesnetabanliprogramlama

import java.util.Scanner

fun main() {

    println("HESAP MAKİNESİ UYGULAMASINA HOŞGELDİNİZ")

    val scanner = Scanner(System.`in`)

    println("Yapmak istediğiniz işlemin rakamını giriniz")
    println("...........................................")
    println("1. Toplama")
    println("2. Cikarma")
    println("3. Carpma")
    println("4. Bölme")
    println("5. Km den Mile cevirme")
    println("6. Üçgen çevre hesaplama")
    println("7. Dikdörtgen alan hesaplama")
    println("8. Faktöriyel hesaplama")

    print("Seçiminiz: ")
    val secim = scanner.nextInt()

    if (secim==1){

        println("1.SAYIYI GİRİNİZ:")
        val sayi1 = scanner.nextInt()
        println("2.SAYIYI GİRİNİZ:")
        val sayi2 = scanner.nextInt()
        val sonuc = Calculator().toplama(sayi1,sayi2)
        println("$sayi1 + $sayi2 = $sonuc")
    }
    if (secim==2){

        println("1.SAYIYI GİRİNİZ:")
        val sayi1 = scanner.nextInt()
        println("2.SAYIYI GİRİNİZ:")
        val sayi2 = scanner.nextInt()
        if (sayi1<sayi2){
            println("1.sayı 2.sayıdan küçük olduğu için negatif bir sonuç elde edildi")
        }
        val sonuc = Calculator().cikarma(sayi1,sayi2)
        println("$sayi1 - $sayi2 = $sonuc")
    }

    if (secim==3){

        println("1.SAYIYI GİRİNİZ:")
        val sayi1 = scanner.nextInt()
        println("2.SAYIYI GİRİNİZ:")
        val sayi2 = scanner.nextInt()
        val sonuc = Calculator().carpma(sayi1,sayi2)
        println("$sayi1 * $sayi2 = $sonuc")
    }

    if (secim==4){

        println("1.SAYIYI GİRİNİZ:")
        val sayi1 = scanner.nextInt()
        println("2.SAYIYI GİRİNİZ:")
        val sayi2 = scanner.nextInt()
        val sonuc = Calculator().bolme(sayi1,sayi2)
        println("$sayi1 / $sayi2 = $sonuc")
    }

    if (secim==5){

        println("Kilometre Değerini GİRİNİZ:")
        val sayi1 = scanner.nextDouble()
        val sonuc = Calculator().mltokm(sayi1)
        println("$sayi1 km = $sonuc mil")
    }

    if (secim==6){

        println("1. Kenarı GİRİNİZ:")
        val sayi1 = scanner.nextInt()
        println("2. Kenarı GİRİNİZ:")
        val sayi2 = scanner.nextInt()
        println("3. Kenarı GİRİNİZ:")
        val sayi3 = scanner.nextInt()
        val sonuc = Calculator().ucgencevre(sayi1,sayi2,sayi3)
        println("$sayi1 + $sayi2 + $sayi3 = $sonuc")
    }

    if (secim==7){

        println("1. Kenarı GİRİNİZ:")
        val sayi1 = scanner.nextInt()
        println("2. Kenarı GİRİNİZ:")
        val sayi2 = scanner.nextInt()
        val sonuc = Calculator().dikdortgenalan(sayi1,sayi2)
        println("$sayi1 x $sayi2 = $sonuc")
    }

    if (secim==8){

        println("Hesaplanacak sayıyı GİRİNİZ:")
        val sayi1 = scanner.nextInt()
        val sonuc = Calculator().calculateFactorial(sayi1)
        println("$sayi1! = $sonuc")
    }
    else{

        println("Hatalı seçim yaptınız. Lütfen tekrar deneyiniz.")
    } 

   




}
