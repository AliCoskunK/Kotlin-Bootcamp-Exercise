package com.example.kotlinbootcamp.standart_programlama

fun main() {
    val yas=17
    val isim="Mehmet"

    if (yas>=18){
        println("Reşitsiniz")

    }else{
        println("Reşit değilsiniz")

    }

    if (isim=="Ahmet"){
        println("Merhaba Ahmet")

    }else if (isim=="Mehmet"){
        println("Tanınmayan kişi")

    }else{
        println("Tanınmayan kişi")
    }

    val ka="Admin"
    val s=12345

    if (ka=="Admin" && s==12345){
        println("Giriş Yapıldı")
    }else{
        println("Hatalı Giriş")

    }

    val sayi=11
    if (sayi==10 || sayi==20){
        println("Sayı 10 veya 20 dir")

    }else{
        println("Sayı 10 veya 20 değildir")
    }

    //When:Switch
    val gun=9
    when(gun){
        1-> println("Pazartesi")
        2-> println("Salı")
        3-> println("Çarşamba")
        4-> println("Perşembe")
        5-> println("Cuma")
        6-> println("Cumartesi")
        7-> println("Pazar")
        else-> println("Böyle bir gün yok")
    }















}