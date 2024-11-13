package com.example.kotlinbootcamp.nesnetabanliprogramlama

fun main() {
    val f=Fonksiyonlar()
    f.selamla1()

    val gelensonuc=f.selamla2()
    println("Gelen sonuç:$gelensonuc")


    f.selamla3("zeynep")

    val gelentoplam=f.toplam(10,20)
    println("Gelen toplam:$gelentoplam")

    f.carp(2,10)

}